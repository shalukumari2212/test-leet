
class Solution {
    public TreeNode helper(int[] inorder,int inlo,int inhi, int[] postorder,int plo,int phi){
        if(plo>phi)return null;
        TreeNode root= new TreeNode(postorder[phi]);
        int i= inlo;
        while(inorder[i]!=postorder[phi]) i++;
        int firstSize= inhi-i;
        root.left= helper(inorder,inlo,i-1,postorder,plo,phi-firstSize-1);
        root.right= helper(inorder,i+1,inhi,postorder,phi-firstSize,phi-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n= inorder.length;
       return helper(inorder,0,n-1,postorder,0,n-1);
    }
}