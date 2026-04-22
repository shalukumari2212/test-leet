class Solution {
   
    public int lcs(int i,int j,StringBuilder a,StringBuilder b ,int[][]dp) {
        if(i==-1 || j==-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) return dp[i][j]=1+ lcs(i-1,j-1,a,b,dp);
        else return dp[i][j]= Math.max(lcs(i-1,j,a,b,dp),lcs(i,j-1,a,b,dp));
    }
    public int lcs2(String str1,String str2) {
      int n=str1.length();
      int m=str2.length();
      StringBuilder a= new StringBuilder(str1);
      StringBuilder b= new StringBuilder(str2);
      int[][]dp = new int[n][m];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++) dp[i][j]=-1;
      }
      return lcs(n-1,m-1,a,b,dp);
    }
    public String reverse(String s) {
        StringBuilder a= new StringBuilder(s);
        a.reverse();
        return a.toString(); 
    }
    public int longestPalindromeSubseq(String s) {
        return lcs2(s, reverse(s));
    }
    
    public int minInsertions(String s) {
        int n= s.length();
        return n- longestPalindromeSubseq(s);
    }
}