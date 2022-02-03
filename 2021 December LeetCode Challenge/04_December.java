public class Node{
    Node[] child=new Node[26];
    boolean isEnd;
} 

class StreamChecker {
     public void insert(String s){
    Node curr=root;
    for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        if(curr.child[ch-'a']==null){
            curr.child[ch-'a']=new Node();
        }
        curr=curr.child[ch-'a'];
    }
    curr.isEnd=true;
}
public Node root=new Node();
public StringBuilder x=new StringBuilder();
  public StreamChecker(String[] words) {
     for(int i=0;i<words.length;i++){
         insert(words[i]);
     }
  }

  public boolean query(char letter) {
     x.append(letter);
     String s=x.toString();
     Node curr=root;
     if(curr.child[letter-'a']!=null){
         curr=curr.child[letter-'a'];
         for(int i=s.length()-2;i>=0;i--){
            char t=s.charAt(i);
            if(curr.isEnd){
                return true;
            }
            if(curr.child[t-'a']!=null){
                curr=curr.child[t-'a'];
            }else{
                return false;
            }
         }
         return curr.isEnd;
     }
     return false;
  }
  
}

/**
* Your StreamChecker object will be instantiated and called as such:
* StreamChecker obj = new StreamChecker(words);
* boolean param_1 = obj.query(letter);
*/