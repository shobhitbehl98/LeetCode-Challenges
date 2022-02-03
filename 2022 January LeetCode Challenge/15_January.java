class Solution {
    public int minJumps(int[] arr) {
        boolean[] vis=new boolean[arr.length];
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            List<Integer> indices = hm.getOrDefault(arr[i], new ArrayList<>());
			indices.add(i);
			hm.put(arr[i], indices);
            
        }
        
        return rec(arr,vis,hm);
    }
    
    public int rec(int[] arr,boolean[] vis,HashMap<Integer,List<Integer>> hm){
        LinkedList<Integer> li=new LinkedList<>();
        li.addLast(0);
        int p=0;
        while(li.size()>0){
            int size=li.size();
            while(size-->0){
               int rem=li.removeFirst();
               vis[rem]=true; 
                if(rem==arr.length-1){
                    return p;
                }
                if(hm.containsKey(arr[rem])){
               for(int i=0;i<hm.get(arr[rem]).size();i++){
                   if(!vis[hm.get(arr[rem]).get(i)]){
                       li.addLast(hm.get(arr[rem]).get(i));
                   }
               }
                hm.remove(arr[rem]);
                }
               if(rem-1>=0&&!vis[rem-1]){
                   li.add(rem-1);
               }
                if(rem+1<arr.length&&!vis[rem+1]){
                   li.add(rem+1);
               }
            }
            p++;
        }
        return 0;
    }
}