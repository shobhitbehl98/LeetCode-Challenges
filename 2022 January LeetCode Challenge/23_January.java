class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        int a=low;
        int b=high;
        int ld=0;
        int hd=0;
        while(a>0){
            ld++;
            a/=10;
        }
        while(b>0){
            hd++;
            b/=10;
        }
        String num="123456789";
        for(int p=ld;p<=hd;p++){
            get(num,ans,p,low,high);
        }
        return ans;
    }
    
    public void get(String n,List<Integer> ans,int x,int low,int high){
        for(int i=x-1;i<n.length();i++){
            int j=i-x+1;
            String h=n.substring(j,i+1);
            int v=Integer.parseInt(h);
            if(v>=low&&v<=high){
                ans.add(v);
            }
        }
    }
}