class Solution {
    public int numTilings(int n) {
        int[] dp=new int[n+1];
        
        if(n<3){
            return n;
        }
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++){
            dp[i]=(dp[1]*dp[i-1])+(dp[2]*dp[i-2])+2;
        }
        
        return dp[n];
    }
}