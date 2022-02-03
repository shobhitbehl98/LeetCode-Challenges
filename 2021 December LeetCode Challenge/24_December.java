class Solution {
    public class Pair implements Comparable<Pair>{
        int a;
        int b;
        
        Pair(int a,int b){
            this.a=a;
            this.b=b;    
        }
        
        public int compareTo(Pair t){
            return this.a-t.a;
        }
    }
    public int[][] merge(int[][] intervals) {
        ArrayList<Pair> al=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
           al.add(new Pair(intervals[i][0],intervals[i][1]));
        }
        Collections.sort(al);
        int i=0;
        Stack<Pair> st=new Stack<>();
        st.push(al.get(i));
        i++;
        while(i<al.size()){
          if(al.get(i).a<=st.peek().b){
             Pair v=st.pop();
             st.push(new Pair(Math.min(v.a,al.get(i).a),Math.max(v.b,al.get(i).b))); 
          }else{
              st.push(al.get(i));
          }
            i++;
            
        }
        
        
        int[][] ans=new int[st.size()][2];
        int h=st.size()-1;
        while(h>=0){
            Pair u=st.pop();
            ans[h][0]=u.a;
            ans[h][1]=u.b;
            h--;
        }
        
        return ans;
    }
}