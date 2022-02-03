class Solution {
    public int maxSubArray(int[] arr) {
        int[] ans=new int[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i]=Math.max(arr[i],arr[i]+ans[i-1]);
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++){
            max=Math.max(max,ans[i]);
        }
        
        return max;
    }
}