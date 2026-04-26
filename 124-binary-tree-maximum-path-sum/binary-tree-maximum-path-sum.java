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
    static int maxsum;
    public int sum(TreeNode root) {
        if(root==null) return 0;
        int left = Math.max(0,sum(root.left));
        int right = Math.max(0,sum(root.right));
        int path= root.val + left + right;
        maxsum= Math.max (maxsum, path);
        return  root.val+Math.max(right,left);

    }
    public int maxPathSum(TreeNode root) {
       maxsum = Integer.MIN_VALUE;
       sum(root);
       return maxsum;
       
    }
}