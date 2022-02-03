class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        	HashMap<Character,ArrayList<Integer>> map=new HashMap<>();
		for(int i=0;i<26;i++){
		    map.put((char)('a'+i),new ArrayList<>());
		}
		
		for(String word:words){
		    int mask=0;
		    for(char ch:word.toCharArray()){
		        int bit=ch-'a';
		        mask = mask | ((1<<bit));
		    }
		    HashSet<Character> hs=new HashSet<>();
		    for(char ch:word.toCharArray()){
		        if(!hs.contains(ch)){
		        map.get(ch).add(mask);
		        hs.add(ch);
		        }
		    }
		}
		ArrayList<Integer> ans=new ArrayList<>();
		for(String puzzle:puzzles){
		    int pmask=0;
		    for(char ch:puzzle.toCharArray()){
		        int bit=ch-'a';
		        pmask = pmask | ((1<<bit));
		    }
		    
		    char fc=puzzle.charAt(0);
		    ArrayList<Integer> x=map.get(fc);
		  //  System.out.println(x);
		    int c=0;
		    for(int i=0;i<x.size();i++){
		        int y=x.get(i);
		      //  System.out.println(Integer.toBinaryString(y)+"   "+Integer.toBinaryString(pmask)+" "+puzzle+" "+c);
		        if((y&pmask)==y){
		            c++;
		        }
		    }
		    ans.add(c);
		}
		return ans;
    }
}