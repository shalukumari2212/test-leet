class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k = k % n;
        int []arr= new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            arr[j++]= nums[i];
        }
        j=0;
        for(int i=k-1;i>=0;i--){
            nums[j++]=arr[i];
        }
        for(int i=n-1;i>=k;i--){
            nums[j++]=arr[i];
        }
        
    }
}