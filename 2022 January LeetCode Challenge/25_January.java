class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)return false;
        boolean g=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                if(i==1){
                    return false;
                }else if(!g){
                    g=true;
                }
            }else if(arr[i-1]<arr[i]){
                if(g){
                    return false;
                }
            }else{
                return false;
            }
        }
        
        return g;
    }
}