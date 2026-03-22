class Solution {
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
        for(int i=0;i<n;i++){
            for(int j=i+1; j<=n;j++){
                if(isPalindrome(s.substring(i,j))){
                    count++;
                }
            }
        }
        return count;

    }
}