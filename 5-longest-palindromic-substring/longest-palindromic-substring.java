class Solution {
    //  public boolean isPalindrome(String s){
    //     int i=0;
    //     int j= s.length()-1;
    //     while(i<j){
    //         if(s.charAt(i) == s.charAt(j)){
    //             i++;
    //             j--;
    //         }
    //         else return false;
    //     }
    //     return true;
    // }

    public String longestPalindrome(String s) {
        int n= s.length();
        int count=0;
        int start=0;
        int maxlen=1;
        int[][]dp= new int [n][n];
        for(int k=0;k<n;k++){
            int i=0; int j=k;
            while(j<n){
                if(i==j) {
                    dp[i][j]=1;
                    
                }
                else if(s.charAt(i) == s.charAt(j)){
                    if(j==i+1) {
                        dp[i][j]=1; 
                        
                    }
                    else {
                        dp[i][j]= dp[i+1][j-1];
                        
                    }
                }
                else dp[i][j]=0;
                

                if(dp[i][j] ==1 && (j-i+1) > maxlen){
                    start=i;
                    maxlen= j-i+1;
                }
                i++; j++;
            }
         
        }
return s.substring(start,start+maxlen);
    }
}


//METHOD 1
// int maxLen=0;
//         String str="";

        

//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<=s.length();j++){
//                 String sub= s.substring(i,j);
//                 if(isPalindrome(sub) && sub.length()>maxLen ){
//                     str=sub;
//                     maxLen= sub.length();
                    
//                 }

//             }
//         }
//         return str;


// METHOD2
// int n= s.length();

//         int start=0;
//         int maxlen=1;
//         int[][]dp = new int[n][n];
//         for(int i=0;i<n;i++){            
//             if(i==i) dp[i][i]=1; // diagonal fill                       
//         }

//         for(int i=n-1;i>=0;i--){
//             for(int j=i+1; j<n;j++){
//                 if(s.charAt(i) == s.charAt(j)) {
//                     if(j==i+1) dp[i][j]=1;                     
//                     else dp[i][j]= dp[i+1][j-1];
//                 }
//                 else dp[i][j]=0;

//                 // fill                    
//                 if(dp[i][j] ==1 && (j-i+1 )> maxlen){
//                     start=i;
//                     maxlen= j-i+1;
//                 } 
//         return s.substring(start,start+maxlen);
                             
//             }
//         }