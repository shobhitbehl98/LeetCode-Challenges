class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode ans=new TreeNode(val);
            return ans;
        }
        rec(root,val);
        return root;
    }
    
    public void rec(TreeNode root,int val){
        if(root.val>val){
            if(root.left!=null){
                rec(root.left,val);
            }else{
                TreeNode n=new TreeNode(val);
                root.left=n;
                return;
            }
        }else if(root.val<val){
            if(root.right!=null){
                rec(root.right,val);
            }else{
                TreeNode n=new TreeNode(val);
                root.right=n;
                return;
            }
        }else{
            TreeNode n=new TreeNode(val);
            TreeNode g=root.right;
            root.right=n;
            n.right=g;
            return;
        }
    }
}