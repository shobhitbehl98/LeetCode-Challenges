class Solution {
    public int hammingDistance(int x, int y) {
        int j=31;
        int c=0;
        while(j>=0){
           int a=x&(1<<j);
           int b=y&(1<<j);
            
           if(a!=b){
               c++;
           } 
            
            j--;
        }
        
        return c;
    }
}