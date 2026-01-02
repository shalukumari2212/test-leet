
class Solution {
    // public void inorder(TreeNode root,List<Integer>ans){
    //     if(root==null) return;
    //     inorder(root.left,ans);
    //     ans.add(root.val);
    //     inorder(root.right,ans);
    //     return;
    // }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans= new ArrayList<>();
        // inorder(root,ans);
        TreeNode curr= root;
        while(curr!=null){
            if(curr.left!=null){// find prdecessor
               TreeNode pred= curr.left;
               while(pred.right!=null&& pred.right!=curr) pred=pred.right;
               if(pred.right==null) {
                pred.right=curr;
                curr=curr.left;
               }
               if(pred.right==curr){
                pred.right=null;
                ans.add(curr.val);
                curr=curr.right;
               }            
            }
            else{
                ans.add(curr.val);
                curr=curr.right;
            }
        }
        return ans;

    }
}