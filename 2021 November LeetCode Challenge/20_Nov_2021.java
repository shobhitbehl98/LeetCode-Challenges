class Solution {
    public int singleNonDuplicate(int[] arr) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            int m=(lo+hi)/2;
            if(arr[m]==arr[m-1]){
                if((m-lo+1)%2==0){
                    lo=m+1;
                }else{
                    hi=m;
                }
            }else if(arr[m]==arr[m+1]){
                if((hi-m+1)%2==0){
                    hi=m-1;
                }else{
                    lo=m;
                }
            }else{
                return arr[m];
            }
        }
        
        return arr[lo];
    }
}