class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        UnionFind uf=new UnionFind(accounts.size());
        
        Map<String,Integer> e=new HashMap<>();
        for(int i=0;i<accounts.size();i++){
            List<String> a=accounts.get(i);
            List<String> emails=a.subList(1,a.size());
            for(String email:emails){
                if(!e.containsKey(email)){
                    e.put(email,i);
                }else{
                    int prev=e.get(email);
                    uf.union(prev,i);
                }
            }
        }
        
        Map<Integer,Account> root = new HashMap<>();
        for(int i=0;i<accounts.size();i++){
            
            List<String> account=accounts.get(i);
            
            int r=uf.getAbsoluteParent(i);
            
            if(!root.containsKey(r)){
                String rootaccname=accounts.get(r).get(0);
                root.put(r,new Account(rootaccname));
            }
            
            List<String> email=account.subList(1,account.size());
            root.get(r).emails.addAll(email);
        }
        return root.values().stream().map(acc->acc.toStringList()).collect(Collectors.toList());
    }
    
    static class UnionFind{
        int[] parent;
        UnionFind(int n){
            parent=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }
        
        private void union(int x,int y){
            int pX=getAbsoluteParent(x);
            int pY=getAbsoluteParent(y);
            
            if(pX!=pY){
                parent[pX]=pY;
            }
        }
        
        private int getAbsoluteParent(int i){
            if(parent[i]==i){
                return i;
            }
            
            parent[i]=getAbsoluteParent(parent[i]);
            return parent[i];
        }
    }
    
    static class Account{
        String name;
        Set<String> emails=new TreeSet<>();
        
        Account(String name){
            this.name=name;
        }
        
        List<String> toStringList(){
            List<String> list=new ArrayList<>();
            list.add(name);
            list.addAll(emails);
            return list;
        }
    }
}