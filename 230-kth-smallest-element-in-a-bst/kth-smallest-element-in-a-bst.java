
class Solution {
    static TreeNode prev= null;
    static int i=0;
    public int inorder(TreeNode root,int k){
        if(root==null) return 0;
        
        inorder(root.left,k);
        if(prev==null){
            prev=root;
            i++;
        }
        else if(i==k) return prev.val;
        else{
            prev=root;
            i++;
        }
        inorder(root.right,k);
        return prev.val;

    }
    public int kthSmallest(TreeNode root, int k) {
        prev=null;
        i=0;
        return  inorder(root,k);
    }
}