class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> li=new ArrayList<>();
        rec(root1,li);
        rec(root2,li);
        Collections.sort(li);
        return li;
    }
    
    public void rec(TreeNode root,List<Integer> li){
        if(root==null)return;
        rec(root.left,li);
        li.add(root.val);
        rec(root.right,li);
    }
    
    
}