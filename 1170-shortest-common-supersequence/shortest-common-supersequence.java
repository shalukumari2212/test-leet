class Solution {
    public String LCS(String str1, String str2) {
        int n= str1.length();
        int m= str2.length();
        // int maxlen=0;
        int[][]dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j]= 1+dp[i-1][j-1];
                else dp[i][j]= Math.max(dp[i-1][j] , dp[i][j-1]);
                // maxlen= Math.max(maxlen,dp[i][j]);

            }
        }
        int i=n;
        int j=m;
        StringBuilder str = new StringBuilder(""); 
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                str.append(str1.charAt(i-1) );
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]) i--;
            else j--;
        }
        
        return str.reverse().toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        String lcs = LCS(str1,str2);
        int i=0,j=0,k=0;
        String str ="";
        while(k<lcs.length()){
            while(str1.charAt(i) != lcs.charAt(k)){
                str+= str1.charAt(i++);
            }
            while(str2.charAt(j) != lcs.charAt(k)){
                str+= str2.charAt(j++);
            }
            
            str+= lcs.charAt(k);
            k++;j++;i++;
        }
        while(i<str1.length()){
            str+= str1.charAt(i++);
        }
        while(j<str2.length()){
            str+= str2.charAt(j++);
        }
        return str;

    }
}