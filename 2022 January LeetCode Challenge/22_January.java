class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp=new boolean[n+1];
        if(n==0){
            return false;
        }else if(n==1){
            return true;
        }else if(n==2){
            return false;
        }else if(n==3){
            return true;
        }
        dp[0]=false;
        dp[1]=true;
        dp[2]=false;
        dp[3]=true;
        for(int i=4;i<=n;i++){
            for(int j=1;j*j<=i;j++){
                if(!dp[i-j]){
                   dp[i]=true;
                }
            }
        }
        return dp[n];
    }
    
    public boolean isSq(int h){
        int i=0;
        while(i*i<h){
            i++;
        }
        return (i*i==h);
    }
}