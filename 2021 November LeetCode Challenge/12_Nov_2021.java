/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode c=head;
        if(head==null){
            return null;
        }
        while(c!=null){
            if(c.next!=null&&c.next.val==val){
               ListNode x=c.next.next;
               ListNode k=c.next; 
               while(x!=null&&x.val==val){
                   x=x.next;
                   k=k.next;
               } 
               k.next=null;
               c.next=x; 
            }
            c=c.next;
        }
        
        if(head.val==val){
            return head.next;
        }
       
        return head;
    }
}