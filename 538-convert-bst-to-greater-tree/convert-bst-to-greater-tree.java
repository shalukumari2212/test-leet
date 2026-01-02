

class Solution {
    static int ans=0;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.right);
        ans=ans+root.val;
        root.val=ans;
        inorder(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        ans=0;
         inorder(root);
         return root;
    }
}