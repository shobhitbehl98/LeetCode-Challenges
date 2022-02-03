class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0){
            if(n==1)return n;
            else return -1;
        }
        int[] ans=new int[n];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<trust.length;i++){
            ans[trust[i][0]-1]++;
            hm.put(trust[i][1]-1,hm.getOrDefault(trust[i][1]-1,0)+1);
        }
        
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0&&hm.containsKey(i)&&hm.get(i)==n-1){
                return i+1;
            }
        }
        
        return -1;
    }
}