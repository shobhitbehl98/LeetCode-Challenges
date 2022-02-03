class Solution {
    public class Pair implements Comparable<Pair>{
        int a;
        int b;
        int d;
        
        Pair(int a,int b){
            this.a=a;
            this.b=b;
            this.d=Math.abs((a*a)+(b*b));
        }
        public int compareTo(Pair o){
            return this.d-o.d;
        }
        
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            pq.add(new Pair(points[i][0],points[i][1]));
        }
         if(pq.size()==0){
           int[][] base=new int[0][0];
           return base; 
        }
        int m=1;
        ArrayList<Pair> al=new ArrayList<>();
        while(pq.size()>0&&m<=k){
            al.add(pq.remove());
            m++;
        }
        int[][] ans=new int[al.size()][2];
        for(int i=0;i<al.size();i++){
            ans[i][0]=al.get(i).a;
            ans[i][1]=al.get(i).b;
        }
        
        return ans;
    }
}