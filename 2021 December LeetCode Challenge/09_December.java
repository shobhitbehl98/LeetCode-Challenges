class Solution {
    public boolean canReach(int[] arr, int start) {
       LinkedList<Integer> li=new LinkedList<>();
       boolean[] n=new boolean[arr.length]; 
       li.addLast(start);
       while(li.size()>0){
           int size=li.size();
           while(size-->0){
               int rem=li.removeFirst();
               if(n[rem]){
                   continue;
               }
               n[rem]=true;
               if(arr[rem]==0){
                   return true;
               }
               if(rem+arr[rem]<arr.length){
                   li.addLast(rem+arr[rem]);
               }
               if(rem-arr[rem]>=0){
                   li.addLast(rem-arr[rem]);
               }
           }
       }
        return false;
    }
}