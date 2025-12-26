
class Solution {
    public int height(TreeNode root){
        if(root==null || root.left==null && root.right==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nthlevel(TreeNode root,int n,List<Integer>arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
        }
        nthlevel(root.left,n-1,arr);
        nthlevel(root.right,n-1,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans= new ArrayList<>();
        if(root==null) return ans;

        int l= height(root)+1;
        for(int i=1;i<=l;i++){
          List<Integer>arr= new ArrayList<>();
          nthlevel(root,i,arr);
          ans.add(arr);
        }
        return ans;
    }
}