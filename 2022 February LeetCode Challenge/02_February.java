class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<p.length();i++){
            hm.put(p.charAt(i),hm.getOrDefault(p.charAt(i),0)+1);
        }
       
        int i=0,j=p.length()-1;
        
        List<Integer> ans=new ArrayList<>();
        
        HashMap<Character,Integer> hp=new HashMap<>();
        
        String x=s.substring(i,j+1);
        
        for(int k=0;k<x.length();k++){
               hp.put(x.charAt(k),hp.getOrDefault(x.charAt(k),0)+1);
        }
        while(j<s.length()){
            if(i>0){
                hp.put(s.charAt(i-1),hp.getOrDefault(s.charAt(i-1),0)-1);
                if(hp.get(s.charAt(i-1))==0)hp.remove(s.charAt(i-1));
                hp.put(s.charAt(j),hp.getOrDefault(s.charAt(j),0)+1);
            }
            if(hp.equals(hm)){
                ans.add(i);
            }
            
            i++;
            j++;
        }
        
        
        return ans;
    }
}