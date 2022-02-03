class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> li=new ArrayList<>();
        List<String> ab=new ArrayList<>();
        rec(li,s,ab);
        return li;
    }
    public void rec(List<List<String>> li,String s,List<String> ab){
        if(s.length()==0){
           li.add(new ArrayList<>(ab));
           return; 
        }
        for(int i=0;i<s.length();i++){
                if(check(s.substring(0,i+1))){
                    ab.add(s.substring(0,i+1));
                    rec(li,s.substring(i+1),ab);
                    ab.remove(ab.size()-1);
                }
        }
    }
    
    public boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}