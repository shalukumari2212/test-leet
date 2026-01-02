
class Solution {
    static int ans=0;
    public void helper(TreeNode root,String s){
        if(root==null) return ;
        if(root.left==null & root.right==null){
            s+=root.val;
            ans+= Integer.parseInt(s);
            return;
        }
        helper(root.left,s+root.val);
        helper(root.right,s+root.val);
    }
    
    public int sumNumbers(TreeNode root) {
        ans=0;
         helper(root,"");
         return ans;
    }
}