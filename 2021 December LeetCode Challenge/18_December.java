class Solution {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String nStr=n+"";
        int nlen=nStr.length();
        int noOfDigits=digits.length;
        int total=0;
        
        for(int i=1;i<nlen;i++){
            total+=Math.pow(noOfDigits,i);
        }
        
        for(int i=0;i<nlen;i++){
            boolean hs=false;
            for(String digit:digits){
                if(digit.charAt(0)<nStr.charAt(i)){
                    total+=Math.pow(noOfDigits,nlen-i-1);
                }else if(digit.charAt(0)==nStr.charAt(i)){
                    hs=true;
                    if(i==nlen-1){
                        total++;
                    }
                }
            }
            if(!hs){
                return total;
            }
        }
        return total;
    }
}