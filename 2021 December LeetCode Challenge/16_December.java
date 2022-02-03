class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res=new ArrayList<>();
        if(n<=0)return res;
        if(n==1){
            res.add(0);
            return res;
        }
        
        Map<Integer,Set<Integer>> map=new HashMap<>();
        int[] degree = new int[n];
        for(int[] edge:edges){
            
            degree[edge[0]]++;
            degree[edge[1]]++;
            map.putIfAbsent(edge[0],new HashSet<>());
            map.get(edge[0]).add(edge[1]);
            map.putIfAbsent(edge[1],new HashSet<>());
            map.get(edge[1]).add(edge[0]);
            
        }
        
        Queue<Integer> leaves=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i]==1){
                leaves.offer(i);
            }
        }
        
        int count=n;
        while(count>2){
            int size=leaves.size();
            count-=size;
            while(size-->0){
                Integer leaf=leaves.poll();
                for(Integer con:map.get(leaf)){
                    degree[con]--;
                    if(degree[con]==1){
                        leaves.offer(con);
                    }
                }
            }
        }
        
        return new ArrayList<>(leaves);
    }
}