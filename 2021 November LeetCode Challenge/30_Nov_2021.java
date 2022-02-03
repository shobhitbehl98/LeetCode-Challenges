class Solution {
    public int maximalRectangle(char[][] ar) {
        if(ar.length==0){
            return 0;
        }
        int[][] b=new int[ar.length][ar[0].length];
      for(int i=0;i<b.length;i++){
          for(int j=0;j<b[0].length;j++){
              b[i][j]=ar[i][j]-'0';
              if(i-1>=0&&b[i][j]==1){
                  b[i][j]+=b[i-1][j];
              }
          }
      }
      int max=0;
      for(int i=0;i<b.length;i++){
         int[] r=new int[b[i].length];
         for(int j=0;j<r.length;j++){
            r[j]=b[i][j]; 
         }
         int g=hist(r);
         max=Math.max(g,max);
      }
      return max;
    }
        public int hist(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] a=new int[arr.length];
        int[] b=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            while(st.size()>0&&arr[i]<arr[st.peek()]){
                int y=st.pop();
                a[y]=i;
            }
            st.push(i);
        }
        while(st.size()>0){
            int h=st.pop();
            a[h]=arr.length;
        }
        for(int i=arr.length-1;i>=0;i--){
              while(st.size()>0&&arr[i]<arr[st.peek()]){
                int y=st.pop();
                b[y]=i;
            }
            st.push(i); 
        }
         while(st.size()>0){
            int h=st.pop();
            b[h]=-1;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            int len=a[i]-b[i]-1;
            max=Math.max((arr[i]*len),max);
        }
        
        return max;
    }
}