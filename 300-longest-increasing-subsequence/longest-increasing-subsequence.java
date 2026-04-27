class Solution {
    // public int LIC(int i,int[] nums,int[]dp){
    //     if(i==nums.length){
            
    //       return 0;
    //     }
    //     if(dp[i]!=-1) return dp[i]; 
    //     int skip  = LIC(i+1,nums,dp);
        
    //     if(dp[i]==-1 || nums[i-1]<nums[i]){
    //         int take= 1 +LIC(i+1,nums ,dp);
    //         dp[i]= Math.max(take,skip);
    //     }
    //     return dp[i];
        
       

    // }
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int maxlen=1;
        int[]dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=i;j>=0;j--){
                if(nums[i]>nums[j]){
                    dp[i]= Math.max(dp[i], 1+dp[j]);
                  
                }
              
            }
           maxlen= Math.max(maxlen,dp[i]);
        }
        return maxlen;
        // int[]dp =new int[nums.length];
        // Arrays.fill(dp,-1);
        // return  LIC(0 ,nums,dp );
    }
}