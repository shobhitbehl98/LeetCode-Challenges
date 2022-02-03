class Solution {
    public class DSU{
        int[] parents;
        
        DSU(int n){
           parents=new int[n+1];
           for(int i=0;i<parents.length;i++){
               parents[i]=i;
           } 
        }
        
        private void union(int i,int j){
            int x=abs(i);
            int y=abs(j);
            
            if(x!=y){
                parents[y]=x;
            }
        }
        
        private int abs(int k){
            if(parents[k]==k){
                return k;
            }
            
            parents[k]=abs(parents[k]);
            return parents[k];
        }
    }
    public int largestComponentSize(int[] nums) {
        int max=0;
        for(int val:nums){
            max=Math.max(max,val);
        }
        
        DSU dsu=new DSU(max+1);
        for(int i:nums){
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    dsu.union(j,i);
                    dsu.union(i/j,i);
                }
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int maxComp=0;
        for(int g:nums){
            int f=dsu.abs(g);
            hm.put(f,hm.getOrDefault(f,0)+1);
            maxComp=Math.max(maxComp,hm.get(f));
        }
        
        return maxComp;
    }
}