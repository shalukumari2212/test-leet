class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
        }
        int sum=0;
        for(int i=1;i<=nums.length;i++){
            sum+=i;
        }
        return sum-ans; 
    }
}