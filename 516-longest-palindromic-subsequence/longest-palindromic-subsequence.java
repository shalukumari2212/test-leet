class Solution {
    public int lcs(int i,int j , StringBuilder a,StringBuilder b,int[][]dp){
      if(i==-1 || j==-1) return 0;
      if(dp[i][j]!=-1) return dp[i][j];
      if(a.charAt(i) == b.charAt(j)) return dp[i][j]= 1+lcs(i-1,j-1,a,b,dp);
      else return dp[i][j]= Math.max(lcs(i,j-1,a,b,dp),lcs(i-1,j,a,b,dp));
    }
    public int lcs2(String str1, String str2){
        int n=str1.length();
        int m=str2.length();
        StringBuilder a = new StringBuilder(str1);
        StringBuilder b = new StringBuilder(str2);
        int[][]dp= new int[n][m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++) dp[i][j]=-1;
        }
        return lcs(n-1,m-1,a,b,dp);
    }
    public String reverseString(String str){
     StringBuilder s = new StringBuilder(str);
     s.reverse();
     return s.toString();
     

    }
   
    public int longestPalindromeSubseq(String str) {
      return lcs2(str,reverseString(str));

    }
}

