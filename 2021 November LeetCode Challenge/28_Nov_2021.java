class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        xm=new ArrayList<>();
         List<Integer> x=new ArrayList<>();
            x.add(0);
        for(int i=0;i<graph[0].length;i++){
            x.add(graph[0][i]);
            boolean[] v=new boolean[graph.length];
            v[0]=true;
            dfs(graph,graph[0][i],x,v);
            v[0]=false;
            x.remove(x.size()-1);
        }
        return xm;
    }
    public List<List<Integer>> xm;
    
    public void dfs(int[][] graph,int h,List<Integer> x,boolean[] v){
       
        if(h==graph.length-1){
            List<Integer> base=new ArrayList(x);
            xm.add(base);
            return;
        }
        for(int i=0;i<graph[h].length;i++){
            if(!v[graph[h][i]]){
                v[graph[h][i]]=true;
                x.add(graph[h][i]);
            dfs(graph,graph[h][i],x,v);
                x.remove(x.size()-1);
                v[graph[h][i]]=false;
            }
        }
    }
}