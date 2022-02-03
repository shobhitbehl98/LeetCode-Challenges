class Solution {
    public int maxPower(String s) {
        if(s.length()==0){
            return 0;
        }
        int max=1;
        int j=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                if(j==0){
                    j+=2;
                }else{
                    j++;
                }
            }else{
                j=0;
            }
            max=Math.max(j,max);
        }
        
        return max;
    }
}