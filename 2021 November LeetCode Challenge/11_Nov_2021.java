class Solution {
    public int minStartValue(int[] nums) {
        int[] ps=new int[nums.length];
        ps[0]=nums[0];
        int min=ps[0];
        for(int i=1;i<nums.length;i++){
            ps[i]=nums[i]+ps[i-1];
            min=Math.min(min,ps[i]);
        }
        
        if(min>=0){
            return 1;
        }
        min*=-1;
        return min+1;
        
    }
}