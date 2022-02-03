class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.sort(nums);
        Arrays.fill(arr,1);
        int max=1;
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            while(j>=0){
                if(nums[i]%nums[j]==0){
                    if(arr[i]<arr[j]+1){
                        arr[i]=arr[j]+1;
                    }
                }
                max=Math.max(max,arr[i]);
                j--;
            }
        }
        int c=max;
        int prev=-1;
        List<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==c&&(prev==-1||prev%nums[i]==0)){
                ans.add(nums[i]);
                c--;
                prev=nums[i];
            }
        }
        
        return ans;
    }
}