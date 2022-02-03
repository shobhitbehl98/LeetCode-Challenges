class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==min){
                List<Integer> d=new ArrayList<>();
                d.add(arr[i]);
                d.add(arr[i+1]);
                li.add(d);
            }
        }
        return li;
    }
}