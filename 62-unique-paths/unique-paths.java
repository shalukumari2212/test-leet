class Solution {
    // public int path(int i,int j,int m ,int n,int[][] dp){
    //     if(i>=m || j>=n) return 0;
    //     if(i==m-1 || j==n-1) return 1;
    //     if(dp[i][j]!= -1) return dp[i][j];
    //     int rightways = path(i,j+1,m,n,dp);
    //     int downtways = path(i+1,j,m,n,dp);
    //     return dp[i][j]=rightways + downtways;
    // }
    // int[][] dp = new int[m][n];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             dp[i][j] =-1;
    //         }
    //     }   
    //     return path(0,0,m,n,dp);

    public int uniquePaths(int m, int n) {   
        int[][] dp= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) dp[i][j]=1;
                else{
                    dp[i][j]= dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];

    }
}