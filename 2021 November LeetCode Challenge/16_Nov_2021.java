class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l=1;
        int h=m*n;
        while(l<h){
            int mid=l+((h-l)/2);
            int c=count(m,n,mid);
            
            if(c>=k){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        
        return l;
    }
    
    public int count(int m,int n,int mid){
        int c=0;
        for(int i=1;i<=m;i++){
            int temp=Math.min((mid/i),n);
            c+=temp;
        }
        
        return c;
    }
}