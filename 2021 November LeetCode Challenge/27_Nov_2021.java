class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a=new int[nums.length];
        int[] b=new int[nums.length];
        a[0]=nums[0];
        b[b.length-1]=nums[b.length-1];
        for(int i=1,j=nums.length-2;i<nums.length&&j>=0;i++,j--){
            a[i]=nums[i]*a[i-1];
            b[j]=nums[j]*b[j+1];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=b[i+1];
            }else if(i==nums.length-1){
                ans[i]=a[i-1];
            }else{
                ans[i]=a[i-1]*b[i+1];
            }
        }
        
        return ans;
    }
}