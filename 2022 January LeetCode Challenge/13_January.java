class Solution {
    public class Pair{
        long a;
        long b;
        
        Pair(long a,long b){
            this.a=a;
            this.b=b;
        }
        
    }
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        Pair[] arr=new Pair[points.length];
        for(int i=0;i<points.length;i++){
            arr[i]=new Pair(points[i][0],points[i][1]);
        }
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            
            if(st.size()>0&&arr[i].a<=st.peek().b){
                Pair rem=st.pop();
                Pair n=new Pair(Math.max(arr[i].a,rem.a),Math.min(arr[i].b,rem.b));
                st.push(n);
            }else{
                st.push(arr[i]);
            }
            
        }
        
        return st.size();
    }
}