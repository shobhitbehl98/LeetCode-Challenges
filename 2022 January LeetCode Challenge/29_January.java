class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        
         for(int i=0;i<=arr.length;i++){
             int val =i==arr.length?0:arr[i];
        while(st.peek()!=-1&&val<=arr[st.peek()]){
            int rm=i;
            int h=arr[st.pop()];
            int lm=st.peek();
            max=Math.max(max,h*(rm-lm-1));
        }
        st.push(i);
    }
        return max;
    }
    
}