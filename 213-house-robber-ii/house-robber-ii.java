class Solution {
    public int maxAmount(int [] nums,int i,int end,int[]dp){
        if(i > end) return 0;
        if(dp[i]!=-1) return dp[i];
        int take= nums[i]+ maxAmount(nums,i+2,end,dp);
        int skip= maxAmount(nums,i+1,end,dp);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n= nums.length;
        int [] dp1 = new int[n+1];
        int [] dp2 = new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        
        if(n<=1) return nums[0];
        int case1= maxAmount(nums,0,n-2,dp1);
        int case2= maxAmount(nums,1,n-1,dp2);
        return Math.max(case1 ,case2);
    }
}