class Solution {
    public int rob2(int[] nums ,int i ,int[]dp) {
        if(i>=nums.length) return 0;
        if(dp[i] !=-1) return dp[i];
        int take= nums[i] + rob2(nums,i+2,dp);
        int skip = rob2(nums,i+1,dp);
        return dp[i]= Math.max(take,skip);
    }
    public int maxAmount(int []nums, int[]dp,int n){
        if (n == 1) return nums[0];
        dp[0]= nums[0];
        dp[1] = Math.max(nums[0] , nums[1]);
        // int n= nums.length;

        for(int i=2;i<n;i++){
            dp[i] = Math.max( nums[i]+ dp[i-2] , dp[i-1]);

        }
        return dp[n-1];
    }

    public int rob(int[] nums) {
        int n= nums.length;
        int [] dp = new int[n];
        return maxAmount(nums,dp,n);
        // Arrays.fill(dp,-1);
    
    //  return rob2(nums,0,dp);
    }
}