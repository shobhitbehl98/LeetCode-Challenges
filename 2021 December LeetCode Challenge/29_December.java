class Solution {
    public Node connect(Node root) {
        if(root==null)return root;
        LinkedList<Node> qu=new LinkedList<>();
        qu.addLast(root);
        while(qu.size()>0){
            int size=qu.size();
            while(size-->0){
                Node rem=qu.removeFirst();
                if(size>0){
                    rem.next=qu.peekFirst();
                }
                if(rem.left!=null){
                qu.addLast(rem.left);
                }
                if(rem.right!=null){
                qu.addLast(rem.right);
                }
            }
        }
        return root;
    }
}