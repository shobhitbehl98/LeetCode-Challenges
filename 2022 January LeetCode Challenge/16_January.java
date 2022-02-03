class Solution {
    public int maxDistToClosest(int[] seats) {
        int j=-1;
        int max=0;
        int i=0;
        int p=0;
        int a=0;
        int b=0;
        while(i<seats.length){
            if(seats[i]==1){
                p++;
                max=Math.max(max,(i-j-1));
                if(p==1){
                    a=max;
                }
                // System.out.println(i+" "+j+" "+max);
                j=i;
            }
            i++;
        }
        b=(i-j-1);
        int c=0;
        if(max%2==0){
            c=Math.max((max/2),a);
        }else{
            c=Math.max(((max/2)+1),a);
        }
        
        return Math.max(a,Math.max(b,c));
    }
}