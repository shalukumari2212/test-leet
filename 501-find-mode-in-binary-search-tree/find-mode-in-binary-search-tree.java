/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     TreeNode prev=null;
     int count=0;
     int maxcount=0;
    List<Integer>arr= new ArrayList<>();

    public void helper(TreeNode root){    
        if(root==null) return;
        helper(root.left);

        if(prev==null || prev.val!=root.val ){
            count=1;
        }else count++;

        if(count>maxcount){
            maxcount=count;
            arr.clear();
            arr.add(root.val);
        }
        else if(count==maxcount) arr.add(root.val);
        prev=root;
        helper(root.right);
    }

    public int[] findMode(TreeNode root) {
        prev=null;
        count=0;
        maxcount=0;
        arr.clear(); 
        helper(root);
        int [] ans= new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
        
    }
}