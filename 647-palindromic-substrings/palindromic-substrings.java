class Solution {
    //METHOD 1
    public boolean isPalindrome(String s){
        int i=0;
        int j= s.length()-1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n= s.length();
        int count=0;
        int[][]dp = new int[n][n];

        for(int i=0;i<n;i++){            
            if(i==i) dp[i][i]=1;
            count++;  // diagonal fill         
        }

        for(int i=n-1;i>=0;i--){
            for(int j=i+1; j<n;j++){
                if(s.charAt(i) == s.charAt(j)) {
                    if(j==i+1) {
                        dp[i][j]=1; 
                    }
                    else dp[i][j]= dp[i+1][j-1];
                    count+= dp[i][j];

                }
                else dp[i][j]=0;
                                
            }
        }
        return count;

    }
}


// int n= s.length();
//         int count=0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<=n;j++){
//                 if(isPalindrome(s.substring(i,j))) count++;
//             }
//         }
//         return count;
    //Method2





// METHOD 3
// int n= s.length();
//         int count=0;
//         int[][]dp= new int [n][n];
//         for(int k=0;k<n;k++){
//             int i=0; int j=k;
//             while(j<n){
//                 if(i==j) {
//                     dp[i][j]=1;
//                     count++;
//                 }
//                 else if(s.charAt(i) == s.charAt(j)){
//                     if(j==i+1) {
//                         dp[i][j]=1; 
//                         count++;
//                     }
//                     else {
//                         dp[i][j]= dp[i+1][j-1];
//                         if(dp[i][j]==1) count++;
//                     }
//                 }
//                 else dp[i][j]=0;
//                 i++; j++;

//             }
//         }
//         return count;