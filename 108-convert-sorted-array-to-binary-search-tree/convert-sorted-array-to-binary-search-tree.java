
class Solution {
    public TreeNode binarySearch(int[] nums,int low,int high){
        if(low>high)return null;
        int mid= (low+high)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left=binarySearch(nums,low,mid-1);
        root.right=binarySearch(nums,mid+1,high);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n= nums.length;
        
        return  binarySearch(nums,0,n-1);
        
    }
}