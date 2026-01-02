
class Solution {
    public TreeNode BST(TreeNode root,int target){
        if(root==null)  new TreeNode(target);
        if(target<root.val) {
            if(root.left==null) root.left=new TreeNode(target);
            else root.left=BST(root.left,target);
        }
        if(target>root.val){
            if(root.right==null)root.right=new TreeNode(target);
            else root.right=BST(root.right,target);
        }
        return root;
    }
  
    public TreeNode bstFromPreorder(int[] arr) {
      TreeNode root= new TreeNode(arr[0]);
      for(int i=1;i<arr.length;i++){
        BST(root,arr[i]);
      }
      return root;
    }
}