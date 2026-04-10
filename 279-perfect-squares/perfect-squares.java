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
      int[] dp = new int [n+1];
       
      for(int i=1;i<=n;i++){
        if(isPerfectSqr(i)) dp[i] = 1;
        else{
            int min= Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
              int count= dp[j*j]+dp[i-j*j];
              min=Math.min(min,count);
            }
            dp[i]=min;
        }
        
      }
      return dp[n];

    //    int[]dp= new int[n+1];
    //    Arrays.fill(dp,-1);
    //     return squares(n,dp);

    }
}