public class Pair {
    int w;
    int r;

    Pair(int w, int r) {
      this.w = w;
      this.r = r;
    }
     Pair(){
         
     }
  }

class Solution {
    public int rob(TreeNode root) {
      Pair ans=HouseRobber(root);
       return Math.max(ans.w,ans.r); 
    }
    
  public Pair HouseRobber(TreeNode root) {
    if (root == null) {
      return new Pair(0, 0);
    }
    
    Pair left = HouseRobber(root.left);
    Pair right = HouseRobber(root.right);
    
    Pair ans=new Pair();
    ans.w=Math.max(left.r,left.w)+Math.max(right.r,right.w);
    ans.r=left.w+right.w+root.val;  
    return ans;
  }
}