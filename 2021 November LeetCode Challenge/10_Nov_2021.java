class Solution {
    public int maxProfit(int[] arr) {
         int j=1;
        int min=arr[0];
        int max=min;
        int profit=0;
        while(j<arr.length){
            while(j<arr.length&&arr[j]>max){
                max=Math.max(arr[j],max);
                j++;
            }
            profit+=max-min;
            if(j<arr.length){
                min=arr[j];
                max=min;
                j++;
            }else{
                break;
            }
        }
        
   return profit;
    }
}