
class Solution {
    public TreeNode helper(int[] preorder, int plo,int phi,int[] inorder,int inlo,int inhi){
        
        if(plo>phi)return null;
        TreeNode root= new TreeNode(preorder[plo]);
        int i= inlo;
        while(preorder[plo]!=inorder[i]) i++;
        int leftSize= i-inlo;
        root.left=helper(preorder,plo+1,plo+leftSize,inorder,inlo,i-1);
        root.right=helper(preorder,plo+leftSize+1,phi,inorder,i+1,inhi);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n= preorder.length;
       TreeNode node= helper(preorder,0,n-1,inorder,0,n-1);
       return node;
    }
    
}