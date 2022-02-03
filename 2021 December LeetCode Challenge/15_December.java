class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(-5001);
        dummy.next=head;
        ListNode curr=head;
        while(curr.next!=null){
            if(curr.next.val<curr.val){
                ListNode r=dummy;
                ListNode nxt=curr.next;
                while(r.next.val<nxt.val){
                    r=r.next;
                }
                ListNode p=nxt.next;
                ListNode v=r.next;
                r.next=nxt;
                nxt.next=v;
                curr.next=p;
            }else{
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}