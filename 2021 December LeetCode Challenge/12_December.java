class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int val:nums){
            sum+=val;
        }
        
        if(sum%2!=0){
            return false;
        }
        sum/=2;
        boolean[][] dp=new boolean[nums.length][sum+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(j==0){
                    dp[i][j]=true;
                }else if(i>0&&(((nums[i]<=j)&&(dp[i-1][j-nums[i]]))||dp[i-1][j])){
                    dp[i][j]=true;
                }
            }
        }
        return dp[nums.length-1][sum];
    }
}