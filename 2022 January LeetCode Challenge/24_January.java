class Solution {
    public boolean detectCapitalUse(String word) {
        int small=0;
        int capital=0;
        if(word.charAt(0)>=65&&word.charAt(0)<=90){
            int set=-1;
            for(int i=1;i<word.length();i++){
            if(word.charAt(i)>=97&&word.charAt(i)<=122){
                if(set==1)return false;
                 set=0;
            }else if(word.charAt(i)>=65&&word.charAt(i)<=90){
                if(set==0)return false;
                set=1;
            }else{
                return false;
            }
        }
        }else{
            for(int i=0;i<word.length();i++){
            if(word.charAt(i)>=97&&word.charAt(i)<=122){
                 continue;
            }else{
                return false;
            }
        }
        }
        return true;
    }
  
}