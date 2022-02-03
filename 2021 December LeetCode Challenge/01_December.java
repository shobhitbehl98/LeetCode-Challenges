class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }else if(nums.length==1){
            return nums[0];
        }
        
        int i=2;
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
        while(i<nums.length){
           if(i-3>=0){
               dp[i]=Math.max((nums[i]+dp[i-3]),(nums[i]+dp[i-2]));
           }else{
               dp[i]=nums[i]+dp[i-2];
           }
            i++;
        }
        
        return Math.max(dp[dp.length-1],dp[dp.length-2]);
    }
}