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
    public int sumNumbers(TreeNode root) {
        sum=0;
        dfs(root,"");
        return sum;     
    }
    
    public int sum=0;
    
    public void dfs(TreeNode root,String s){
        if(root==null){
           return;
        }
        s+=root.val;
        if(root.left==null&&root.right==null){
            sum+=Integer.parseInt(s);
             s=s.substring(0,s.length()-1);
            return;
        }
        dfs(root.left,s);
        dfs(root.right,s);
        s=s.substring(0,s.length()-1);
    }
}