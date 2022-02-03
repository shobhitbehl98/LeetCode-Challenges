class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li=new ArrayList<>();
        boolean[] arr=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
           arr[nums[i]]=true;
        }
        
        for(int i=1;i<arr.length;i++){
            if(!arr[i]){
                li.add(i);
            }
        }
        
        return li;
    }
}