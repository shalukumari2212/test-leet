class Solution {
    public boolean isPerfectSqr(int n){
        int num= (int)Math.sqrt(n);
        if(num*num == n) return true;
        else return false;
    }
    public int squares(int n,int[]dp) {
        if(isPerfectSqr(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        int min= Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int count=squares(i*i,dp)+squares(n-i*i,dp);
           min=  Math.min(min,count);
        }
        return dp[n]=min;
        
    }
    public int numSquares(int n) {
      
       int[]dp= new int[n+1];
       Arrays.fill(dp,-1);
        return squares(n,dp);

    }
}