
class Solution {
    public int height(TreeNode root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nthLevel(TreeNode root,int n,List<Integer>arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
        }
        nthLevel(root.left,n-1,arr);
        nthLevel(root.right,n-1,arr);
    }
    public void nthLevelRev(TreeNode root,int n,List<Integer>arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
        } 
        nthLevelRev(root.right,n-1,arr);
        nthLevelRev(root.left,n-1,arr);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans= new ArrayList<>();
        int l= height(root)+1;
        if(root==null) return ans;
        
        for(int i=1;i<=l;i++){
            List<Integer>arr= new ArrayList<>();
            if(i%2!=0) nthLevel(root,i,arr);
            else  nthLevelRev(root,i,arr);
            ans.add(arr);
        }
        return ans;
    }
}