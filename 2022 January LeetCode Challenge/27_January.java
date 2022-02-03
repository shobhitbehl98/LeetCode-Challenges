class Solution {
    public int findMaximumXOR(int[] nums) {
        if(nums.length==0)return 0;
        root=new Node();
       for(int i=0;i<nums.length;i++){
           build(nums[i]);
       }
        
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           int j=get(nums[i]);
           max=Math.max((j^nums[i]),max);
       }
        
        return max;
    }
    
    public int get(int val){
        Node curr=root;
        int ans=0;
         for(int i=31;i>=0;i--){
            int k=val&(1<<i);
            int j=(k>0)?1:0;
             j^=1;
            if(curr.child[j]==null){
                curr=curr.child[j^1];
                if((j^1)==1){
                    ans=(ans*2)+1;
                }else{
                    ans*=2;
                }
            }else{
            curr=curr.child[j];
            if(j==1){
                    ans=(ans*2)+1;
                }else{
                    ans*=2;
                }    
            }
        }
        
        return ans;
        
    }
    private Node root;
    public class Node{
        int val;
        Node[] child=new Node[2];
        
        Node(int val,Node[] child){
            this.val=val;
            this.child=child;
        }
        
        Node(){
            this.val=val;
            this.child=child;
        }
    }
    
    public void build(int n){
        Node curr=root;
        for(int i=31;i>=0;i--){
            int k=n&(1<<i);
            int j=(k>0)?1:0;
            if(curr.child[j]==null){
                curr.child[j]=new Node();
            }
            curr=curr.child[j];
        }
    }
}