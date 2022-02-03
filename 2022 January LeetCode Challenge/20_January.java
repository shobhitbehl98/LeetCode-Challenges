class Solution {
    public int minEatingSpeed(int[] p, int h) {
        
        Arrays.sort(p);
        int i=1;
        int j=p[p.length-1];
        int fans=p[p.length-1];
        while(i<=j){
            int m=(i+j)/2;
            int v=get(m,p);
            if(v<=h){
                fans=Math.min(m,fans);
                j=m-1;
            }else{
                i=m+1;
            }
        }
        
        return fans;
    }
    
    public static int get(int m,int[] p){
        int ans=0;
        for(int i=0;i<p.length;i++){
            int y=p[i]%m;
            ans+=p[i]/m;
            if(y>0){
                ans++;
            }
        }
        
        return (int)ans;
    }
}