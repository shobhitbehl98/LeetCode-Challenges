class CombinationIterator {
    PriorityQueue<String> li=new PriorityQueue<>();
   public CombinationIterator(String c, int l) {
       int i=(int)Math.pow(2,c.length())-1;
       for(int j=0;j<=i;j++){
           int t=0;
           String f="";
           while(t<c.length()){
               if((j&(1<<t))>0){
                   char v=c.charAt(t);
                   f+=v;
               }
               t++;
           }
           if(f.length()==l){
               li.add(f);
           }
       }
   }
   
   public String next() {
       if(hasNext()){
          return li.poll();
       }
       return null;
   }
   
   public boolean hasNext() {
       return (li.size()>0);
   }
}

/**
* Your CombinationIterator object will be instantiated and called as such:
* CombinationIterator obj = new CombinationIterator(characters, combinationLength);
* String param_1 = obj.next();
* boolean param_2 = obj.hasNext();
*/