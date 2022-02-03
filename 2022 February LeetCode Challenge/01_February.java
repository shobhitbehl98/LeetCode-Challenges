class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int minv=-1;
        for(int i=0;i<prices.length;i++){
            if(i==0){
                minv=prices[0];
            }else{
                max=Math.max(max,(prices[i]-minv));
                minv=Math.min(minv,prices[i]);
            }
            
        }
        
        return max;
    }
}