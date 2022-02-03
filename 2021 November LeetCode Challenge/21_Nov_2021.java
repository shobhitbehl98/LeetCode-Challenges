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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return buildTree_(0,n-1,inorder,0,n-1,postorder);
    }
    
    public TreeNode buildTree_(int isi,int iei,int[] inorder,int psi,int pei,int[] postorder){
        if(iei<isi||pei<psi){
            return null;
        }
        int idx=0;
        int j=isi;
        while(inorder[j]!=postorder[pei]){
            idx++;
            j++;
        }
        TreeNode x=new TreeNode(postorder[pei]);
        x.left=buildTree_(isi,isi+idx-1,inorder,psi,psi+idx-1,postorder);
        x.right=buildTree_(isi+idx+1,iei,inorder,psi+idx,pei-1,postorder);
        return x;
    }
}