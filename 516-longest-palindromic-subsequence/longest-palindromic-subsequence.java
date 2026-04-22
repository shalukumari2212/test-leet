class Solution {
    public int lps(int i,int j,StringBuilder str,int[][]dp){
       if(i>j) return 0;
       if(i==j) return 1;
       if(dp[i][j]!=-1) return dp[i][j];
       if(str.charAt(i)== str.charAt(j)) return dp[i][j]= 2+ lps(i+1,j-1,str,dp);
       else return dp[i][j]= Math.max(lps(i,j-1,str,dp) , lps(i+1,j,str,dp));
    }
   
    public int longestPalindromeSubseq(String str) {
      int n= str.length();
      StringBuilder a = new StringBuilder(str);
      int[][]dp= new int[n][n];
      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++) dp[i][j]=-1;
      }
      return lps(0,n-1,a,dp);
    }
}

//  public int lps( int  i, int j,StringBuilder s,int[][]dp ){
    //  if(i>j) return 0;
    //  if(i==j) return 1;
    //  if(dp[i][j]!= -1) return dp[i][j];
    //  if(s.charAt(i) == s.charAt(j)) return dp[i][j]=  2 + lps(i+1 ,j-1 ,s,dp);
    //  else return dp[i][j]=Math.max(lps(i+1,j,s,dp) , lps(i,j-1,s,dp));
    // }

    //  StringBuilder s= new StringBuilder(str);
    //     int n= s.length();

    //     int[][]dp= new int[n][n];
    //     for(int i = n-1; i >= 0; i--){
    //       for(int j = i; j < n; j++) dp[i][j] =-1;          
    //     }
    //     return lps(0,n-1,s,dp);