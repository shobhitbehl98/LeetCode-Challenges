class Solution {
    public int[] dailyTemperatures(int[] a) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[a.length];
        for(int i=0;i<a.length;i++){
            while(st.size()>0&&a[i]>a[st.peek()]){
                int x=st.pop();
                ans[x]=i-x;
            }
            st.push(i);
        }
        
        return ans;
    }
}