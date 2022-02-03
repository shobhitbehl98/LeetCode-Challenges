class Solution {
   
    public String decodeString(String s) {
       Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==']'){
               String y="";
               while(st.peek()!='['){
                   y=st.pop()+y;
               }
               st.pop();
               String j="";
               while(st.size()>0&&(st.peek()-'0'>=0&&st.peek()-'0'<=9)){
                   j=st.pop()+j;
               }
               int z=Integer.parseInt(j);
               String t="";
               for(int k=0;k<z;k++){
                   t+=y;
               }
               for(int k=0;k<t.length();k++){
                   st.push(t.charAt(k));
               }
           }else{
               st.push(s.charAt(i));
           }
       } 
        String f="";
        while(st.size()>0){
            f=st.pop()+f;
        }
        
        return f;
    }
}