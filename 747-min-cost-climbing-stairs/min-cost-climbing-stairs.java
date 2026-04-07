class Solution {
    public int minCost(int[] cost,int n ,int[]dp){
        if(n<=1) return cost[n];
        if(dp[n] !=-1) return dp[n];
        return dp[n] = cost[n]+ Math.min(minCost(cost , n-1,dp) ,minCost(cost,n-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int idx= cost.length;
        int[] dp = new int [idx];
        Arrays.fill(dp ,-1);
        return Math.min(minCost(cost,idx-1,dp) ,minCost(cost,idx-2,dp));
    }
}