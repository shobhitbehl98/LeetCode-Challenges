class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode od=head;
        ListNode eh=head.next;
        if(eh==null){
            return head;
        }
        ListNode oc=od;
        ListNode evn=eh;
        while(evn.next!=null&&evn.next.next!=null){
            ListNode on=oc.next.next;
            ListNode en=evn.next.next;
            
            oc.next=on;
            oc=oc.next;
            
            evn.next=en;
            evn=evn.next;
        }
        
        if(oc.next.next!=null){
            oc.next=oc.next.next;
            oc=oc.next;
        }
        if(evn.next!=null){
        evn.next=null;
        }
        
        oc.next=eh;
        return od;
    }
}