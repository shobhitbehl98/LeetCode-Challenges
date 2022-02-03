class Solution {
    public int[] singleNumber(int[] arr) {
        int x=0;
   for(int i=0;i<arr.length;i++){
       x=arr[i]^x;
   }
   int h=(~x+1);
   int k=x&h;
   int a=0;
   int b=0;
   for(int i=0;i<arr.length;i++){
       if((arr[i]&k)==0){
           a=arr[i]^a;
       }else{
           b=arr[i]^b;
       }
   }
   int[] ans={a,b};
   return ans;      
}
}