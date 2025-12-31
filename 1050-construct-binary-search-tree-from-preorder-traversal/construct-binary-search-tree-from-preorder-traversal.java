
class Solution {
    public TreeNode binaryTree(TreeNode root,int val){
        if(root==null) return new TreeNode(val);
        if(root.val>val) root.left=binaryTree(root.left,val);
        else root.right=binaryTree(root.right,val);
        return root;
        
    }
    public TreeNode bstFromPreorder(int[] arr) {
       if(arr.length==0) return null;
       TreeNode  root= new TreeNode(arr[0]);
       for(int i=1;i<arr.length;i++){
        binaryTree(root,arr[i]);
       }
       return root;

        
    }
}