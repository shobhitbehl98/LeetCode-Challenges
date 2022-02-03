class Solution {
    public int maximalSquare(char[][] arr) {
        	int max=0;
		int[][] dp=new int[arr.length][arr[0].length];
		for(int i=0;i<dp.length;i++){
		    dp[i][dp[0].length-1]=arr[i][dp[0].length-1]-'0';
		    if(dp[i][dp[0].length-1]==1){
		        max=1;
		    }
		}
        for(int i=0;i<dp[0].length;i++){
		    dp[dp.length-1][i]=arr[dp.length-1][i]-'0';
		    if(dp[dp.length-1][i]==1){
		        max=1;
		    }
		}
		for(int i=dp.length-2;i>=0;i--){
		    for(int j=dp[0].length-2;j>=0;j--){
		        if(arr[i][j]-'0'==1){
		            int f=Math.min(dp[i][j+1],Math.min(dp[i+1][j],dp[i+1][j+1]));
		            dp[i][j]=f+1;
		            max=Math.max(max,f+1);
		        } 
		    }
		}
        

		return max*max;
    }
}