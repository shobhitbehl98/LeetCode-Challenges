//Brute Force [14ms]
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr=new int[1001];
        for(int i=0;i<trips.length;i++){
            for(int p=trips[i][1];p<=trips[i][2]-1;p++){
                arr[p]+=trips[i][0];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>capacity){
                return false;
            }
        }
        
        return true;
    }
}

//Cumulative Sum Solution [1ms]
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr=new int[1001];
        for(int i=0;i<trips.length;i++){
            arr[trips[i][1]]+=trips[i][0];
            arr[trips[i][2]]-=trips[i][0];
        }
        for(int i=0;i<arr.length;i++){
            if(i>0){
            arr[i]+=arr[i-1];
            }
            if(arr[i]>capacity)return false;
        }
        
        return true;
    }
}