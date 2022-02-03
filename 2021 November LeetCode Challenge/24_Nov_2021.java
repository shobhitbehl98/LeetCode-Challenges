class Solution {
    public class Pair{
        int x;
        int y;
        
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    
    public int[][] intervalIntersection(int[][] a, int[][] b) {
       int i=0;
       int j=0;
       ArrayList<Pair> al=new ArrayList<>();
        while(i<a.length&&j<b.length){
            if(a[i][1]>=b[j][0]&&a[i][0]<=b[j][1]){
                al.add(new Pair(Math.max(a[i][0],b[j][0]),Math.min(a[i][1],b[j][1])));
            }
            
            if(a[i][1]<=b[j][1]){
                i++;
            }else{
                j++;
            }
        }
        
        int[][] ans=new int[al.size()][2];
        for(int m=0;m<al.size();m++){
            ans[m][0]=al.get(m).x;
            ans[m][1]=al.get(m).y;
        }
        return ans;
        }
}