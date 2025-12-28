
class Solution {
    public void reverseTraversal(TreeNode root,int n,List<Integer>arr){
        
        if(root==null) return; 
        if(n==1){
            arr.add(root.val);
            return;
        }
        
        reverseTraversal(root.left,n-1,arr);
        reverseTraversal(root.right,n-1,arr);

    }

    public int height(TreeNode root){
            if(root==null )return 0;
            return 1+Math.max(height(root.right),height(root.left));
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       
        List<List<Integer>>ans= new ArrayList<>();
        int level= height(root);
        for(int i=level;i>=1;i--){
            List<Integer>arr= new ArrayList<>();
            reverseTraversal(root,i,arr);
            ans.add(arr);
        }
       
        return ans;

    }
}