class Solution {
    // public int lcs(int i,int j,StringBuilder a, StringBuilder b,int[][]dp){
    //     if(i==-1 || j==-1) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     if(a.charAt(i)== b.charAt(j)) return dp[i][j]= 1+lcs(i-1,j-1,a,b,dp);
    //     else  return dp[i][j]= Math.max(lcs(i-1,j,a,b,dp) , lcs(i,j-1,a,b,dp));

    // }
    
    public int longestCommonSubsequence(String text1, String text2) {
       
        int n= text1.length();
        int m= text2.length();
        int [][]dp= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                int p = (i>0 && j>0) ? dp[i-1][j-1] :0;
                int q= (i>0) ?  dp[i-1][j] :0;
                int r= (j>0) ? dp[i][j-1]:0;
            
                if(text1.charAt(i)== text2.charAt(j)) dp[i][j]= 1+p;
                else dp[i][j]= Math.max(q,r )  ;
            }
        }
        int i=n-1 , j=m-1;
        StringBuilder str = new StringBuilder("");

        while(i>0 && j>0){
            if(text1.charAt(i)== text2.charAt(j)){
                str.append(text1.charAt(i));
        //         i--;
        //         j--;

            } 
            if(dp[i-1][j] > dp[i][j-1]) i--;
            else j--;   
        }
        str.reverse();
        System.out.print(str);

        return dp[n-1][m-1];
    
    }
   
}

//METHOD 2

 // int n= text1.length();
    //    int m= text2.length();
    //    StringBuilder a = new StringBuilder(text1);
    //    StringBuilder b = new StringBuilder(text2);
    //    int [][]dp= new int[n][m];
    //    for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++) dp[i][j]=-1;
    //    }
    //    return lcs(n-1,m-1,a,b,dp);

