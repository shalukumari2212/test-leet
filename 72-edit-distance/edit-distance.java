class Solution {
    public int editDis(int i,int j,StringBuilder a, StringBuilder b,int[][]dp) {
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=editDis(i-1,j-1,a,b,dp);

        else {
            int del=editDis(i-1,j,a,b,dp);
            int insert= editDis(i,j-1,a,b,dp);
            int rep = editDis(i-1,j-1,a,b,dp);
            return dp[i][j]= 1+ Math.min(del,Math.min(insert,rep));
        }
            
    
    }

    public int minDistance(String word1, String word2) {
        int n= word1.length();
        int m= word2.length();
        if(n==0) return m;
        if(m==0 ) return n;
        int[][]dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                if(word1.charAt(i)==word2.charAt(j))  dp[i][j] = (i>0 && j>0) ? dp[i-1][j-1] :((i==0) ? j :i );
                else{
                    int del = (i>0) ? dp[i-1][j] : j;
                    int insert =  (j>0) ? dp[i][j-1] : i;
                    int rep = (i>0 && j>0) ? dp[i-1][j-1] : ((i==0) ? j :i );

                    dp[i][j]= 1+ Math.min(del,Math.min(insert,rep));
                }
            }
        }
        return dp[n-1][m-1];
    }
}
// int n= word1.length();
        // int m= word2.length();
        // StringBuilder a= new StringBuilder(word1);
        // StringBuilder b= new StringBuilder(word2);
        // int[][]dp = new int[n][m];
        // for(int i=0;i<n;i++){
        //    for(int j=0;j<m;j++) dp[i][j]=-1;
        // }
        // return editDis(n-1,m-1,a,b,dp);