class Solution {
    public int findPeakElement(int[] nums) {
        // int left = 0;
        // int right= nums.length-1;
        // while(left<=right){
        //     int mid= (left+right)/2;

        //     if((nums[mid] >= nums[mid-1] ) && (nums[mid]>nums[mid+1])) return mid;
        //     if(nums[mid] > nums[mid-1]) left=mid+1;
        //     else right= mid+1;
        // }
        // return -1;

        for(int i=0;i<nums.length;i++){
            boolean left= (i==0) || nums[i]>nums[i-1] ;
            boolean right=  (i== nums.length-1 || nums[i]>nums[i+1]);
            if(left && right) return i; 
           
        }
         return -1;
    
}}