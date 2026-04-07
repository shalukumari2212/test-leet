class Solution {
    public int rob2(int[] nums ,int i ,int[]dp) {
        if(i>=nums.length) return 0;
        if(dp[i] !=-1) return dp[i];
        int take= nums[i] + rob2(nums,i+2,dp);
        int skip = rob2(nums,i+1,dp);
        return dp[i]= Math.max(take,skip);
    }

    public int rob(int[] nums) {
        int n= nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp,-1);
    
     return rob2(nums,0,dp);
    }
}