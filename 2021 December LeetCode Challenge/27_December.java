class Solution {
    public int findComplement(int num) {
        int m=0;
        int k=0;
        int l=0;
        while(k<32){
            if((num&(1<<k))!=0){
                l=k;
            }
            k++;
        }
        while(m<=l){
            int h=1<<m;
            num=num^h;
            m++;
        }
        
        return num;
    }
}