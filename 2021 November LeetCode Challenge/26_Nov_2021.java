class Solution {
    public int searchInsert(int[] arr, int target) {
        int ans=-1;
        int i=0;
        int j=arr.length-1;
        
        while(i<=j){
            // System.out.println(i+" "+j);
            if(i>j){
                break;
            }
            int mid=i+((j-i)/2);
            
            if(arr[mid]==target){
                ans=mid;
                i++;
                j--;
            }else if(i<j){
                if(arr[mid]<target){
                    i=mid+1;
                }else if(arr[mid]>target){
                    j=mid;
                }
            }else if(i==j){
                if(target>arr[mid]){
                    ans=mid+1;
                }else{
                    ans=mid;
                }
                break;
            }
        }
        
        return ans;
        
    }
}