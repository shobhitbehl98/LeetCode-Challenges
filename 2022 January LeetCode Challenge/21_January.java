class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans=0;
        int pans=0;
        int pt=0;
        for(int i=0;i<gas.length;i++){
            pans+=gas[i]-cost[i];
            if(pans<0){
                ans+=pans;
                pans=0;
               if(i+1<gas.length){
                   pt=i+1;
               }else{
                   pt=0;
               }
            }
            
        }
        if(ans+pans<0){
            return -1;
        }
        
        
        return pt;
        
    }
}