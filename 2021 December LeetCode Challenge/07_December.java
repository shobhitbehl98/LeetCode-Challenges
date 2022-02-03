class Solution {
    public int getDecimalValue(ListNode head) {
        int h=0;
        ListNode temp=head;
        m=0;
        int ans=rec(temp);
        return ans;
    }
    public int m;
    public int rec(ListNode temp){
        if(temp==null){
            return 0;
        }
        int r=rec(temp.next);
        int f=temp.val;
        if(f==1){
            r|=1<<m;
        }
        m++;
        return r;
    }
}