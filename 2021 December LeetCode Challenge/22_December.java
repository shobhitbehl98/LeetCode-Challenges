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
    public ListNode reverse(ListNode node){
       if(node==null||node.next==null){
           return node;
       }
       
       ListNode prev=null;
       ListNode curr=node;
       ListNode fwd=null;
       while(curr!=null){
           fwd=curr.next;
           curr.next=prev;
           prev=curr;
           curr=fwd;
       }
       
       return prev;
   }
   
   public ListNode mid(ListNode node){
       if(node==null||node.next==null){
           return node;
       }
       
       ListNode slow=node;
       ListNode fast=node;
       while(fast.next!=null&&fast.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;
   }

   public void reorderList(ListNode head) {
     if(head==null||head.next==null){
           return;
       }
       
       ListNode mid=mid(head);
       ListNode k=mid.next;
       mid.next=null;
       ListNode nh=reverse(k);
       
       
       ListNode c1=head;
       ListNode c2=nh;
       ListNode f1=null;
       ListNode f2=null;
       
       while(c2!=null){
           f1=c1.next;
           f2=c2.next;
           c1.next=c2;
           c2.next=f1;
           c1=f1;
           c2=f2;
       }
       
   }
}