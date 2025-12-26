
class Solution {
    public boolean isSameTree( TreeNode p,TreeNode q){
        if(p==null && q==null ) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
    public TreeNode Inverted(TreeNode root){
        if(root==null) return null;
        TreeNode temp= root.left;
        root.left= root.right;
        root.right= temp;

        Inverted(root.left);
        Inverted(root.right);
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        // if(root==null)return true;
        // Inverted(root.left);
        // return(isSameTree(Inverted(root.left),root.right)) ;

        // or
        root.left= Inverted(root.left);
        return(isSameTree(root.left,root.right));
        
    }
}