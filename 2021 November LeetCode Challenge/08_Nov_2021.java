class Solution {
    public int numTrees(int n) {
        int[] dp=new int[20];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            int m=i-1;
            int j=0;
            int ans=0;
            while(m>=0){
                ans+=dp[m]*dp[j];
                // System.out.println(i+" "+ans+" "+m+" "+dp[m]+" "+j+" "+dp[j]);
                m--;
                j++;
            }
            dp[i]=ans;
        }
        
        return dp[n];
    }
}