class Solution {
    public int path(int i, int j, int[][] grid,int[][] dp){

        int m= grid.length;
        int n= grid[0].length;

        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(i==m-1 && j==n-1) return grid[i][j];

        if(dp[i][j]!= -1) return dp[i][j];

        int rightways = path(i,j+1,grid,dp);
        int downways = path(i+1,j,grid,dp);

        return dp[i][j]= grid[i][j] + Math.min(rightways , downways);
    }
    public int minPathSum(int[][] grid) {
      int m= grid.length;
      int n= grid[0].length;
      int[][] dp= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              dp[i][j] =-1;
            }
        }
        return path(0,0,grid,dp);
    }
}

//   int m= grid.length;
//         int n= grid[0].length;
//         int[][] dp = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0 && j==0) dp[i][j]= grid[i][j];
//                 else if(i==0) dp[i][j]= grid[i][j]+dp[i][j-1];
//                 else if(j==0) dp[i][j]= grid[i][j]+dp[i-1][j];
//                 else{
//                     dp[i][j]= grid[i][j]+ Math.min(dp[i-1][j] , dp[i][j-1]);

//                 }
//             }
//         }
//         return dp[m-1][n-1];