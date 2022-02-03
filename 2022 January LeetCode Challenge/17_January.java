class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm=new HashMap<>();
        HashMap<String,Character> hs=new HashMap<>();
        
        String[] x=s.split(" ");
        if(x.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(!hm.containsKey(pattern.charAt(i))){
                if(hs.containsKey(x[i])){
                    return false;
                }
                hm.put(pattern.charAt(i),x[i]);
                hs.put(x[i],pattern.charAt(i));
            }else if(!hm.get(pattern.charAt(i)).equals(x[i])){
                    return false;
            }
        }
        
        return true;
    }
}