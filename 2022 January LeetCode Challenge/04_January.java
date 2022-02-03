class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int k=32;
        boolean g=false;
        while(k-->0){
            int j=n&(1<<k);
            if(j>0&&!g){
                g=true;
            }
            if(g){
              n^=(1<<k);  
            }
        }
        return n;
    }
}