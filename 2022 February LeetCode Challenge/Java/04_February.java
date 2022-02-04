class Solution {
    public int findMaxLength(int[] nums) {
        int[] fr=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                fr[0]++;
            }else{
                fr[1]++;
            }
            int x=fr[1]-fr[0];
            if(hm.containsKey(x)){
                max=Math.max(max,(i-hm.get(x)));
            }else{
                hm.put((x),i);
            }
        }
        
        return max;
    }
}