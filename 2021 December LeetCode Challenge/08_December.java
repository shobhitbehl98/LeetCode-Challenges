class Solution {
    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
        
    }
   int sum=0;
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=dfs(root.left);
        int r=dfs(root.right);
        sum+=Math.abs(l-r);
        return (l+r+root.val);
    }
}