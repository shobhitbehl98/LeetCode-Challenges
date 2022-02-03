/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        dfs(root,0);
        return sum;
    }
    
    public int sum=0;
    
    public void dfs(TreeNode root,int d){
        if(root==null){
            return;
        }
        
        if(root.left==null&&root.right==null&&d==1){
            sum+=root.val;
            return;
        }
        
        dfs(root.left,1);
        dfs(root.right,2);
        
    }
}