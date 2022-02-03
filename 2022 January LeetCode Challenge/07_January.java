//382. Linked List Random Node
class Solution {
    int size=0;
    ListNode b;
    public Solution(ListNode head) {
       ListNode h=head;
        b=head;
       while(h!=null){
           size++;
           h=h.next;
       }
        
    }
    
    public int getRandom() {
        int v=(int)(Math.random() * (size));
        int i=0;
        ListNode y=b;
        while(i<v){
            y=y.next;
            i++;
        }
        
        return y.val;
    }
}
