class Solution {
    public String multiply(String num1, String num2) {
        int[] ans=new int[num1.length()+num2.length()];
    int k=ans.length-1;
    int c=0;
    int t=0;
    for(int i=num2.length()-1;i>=0;i--){
        for(int j=num1.length()-1;j>=0;j--){
            int sum=((num2.charAt(i)-'0')*(num1.charAt(j)-'0'))+c+ans[k];
            ans[k]=sum%10;
            c=sum/10;
            k--;
        }
        if(c>0){
            ans[k]+=c;
        }
        c=0;
        t++;
        k=ans.length-1-t;
        
    }
    
    StringBuilder sb=new StringBuilder();
    boolean start=false;
    for(int i=0;i<ans.length;i++){
       if(ans[i]!=0){
          start=true; 
       }
       if(start||i==ans.length-1){
           sb.append(ans[i]);
       }
    }
    
    
    return sb.toString();
    }
}