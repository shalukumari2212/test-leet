class Solution {
    // public int maxAmount(int [] nums,int i,int end,int[]dp){
    //     if(i > end) return 0;
    //     if(dp[i]!=-1) return dp[i];
    //     int take= nums[i]+ maxAmount(nums,i+2,end,dp);
    //     int skip= maxAmount(nums,i+1,end,dp);
    //     return dp[i]=Math.max(take,skip);
    // }

// int n= nums.length;
//         int [] dp1 = new int[n+1];
//         int [] dp2 = new int[n+1];
//         Arrays.fill(dp1,-1);
//         Arrays.fill(dp2,-1);      
//         if(n<=1) return nums[0];
//         int case1= maxAmount(nums,0,n-2,dp1);
//         int case2= maxAmount(nums,1,n-1,dp2);
//         return Math.max(case1 ,case2);

    public int rob(int[] nums) {
        int n= nums.length;
        if(n<=1) return nums[0];
        int[] dp1= new int[n];
        int[] dp2= new int[n];

        dp1[0]= nums[0];
        if(n>1) dp1[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<=n-2;i++){
            dp1[i] = Math.max(nums[i]+ dp1[i-2] , dp1[i-1]);
        }

        dp2[1]= nums[1];
        if(n>2) dp2[2] = Math.max(nums[1],nums[2]);
        for(int i=3;i<=n-1;i++){
            dp2[i] = Math.max(nums[i]+ dp2[i-2] , dp2[i-1]);
        }
        return Math.max(dp1[n-2] , dp2[n-1]);
    }
}