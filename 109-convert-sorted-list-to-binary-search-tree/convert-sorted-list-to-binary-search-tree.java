
class Solution {
    public TreeNode binarysearch(int[]arr,int low,int high){
        if(low>high)return null;
        int mid= (low+high)/2;
        TreeNode root= new TreeNode(arr[mid]);
        root.left=binarysearch(arr,low,mid-1);
        root.right=binarysearch(arr,mid+1,high);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int[]arr= new int[n];
        int i=0;
        temp=head;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        return binarysearch(arr,0,n-1);

    }
}