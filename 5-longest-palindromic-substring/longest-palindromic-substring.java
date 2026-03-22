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
    public String longestPalindrome(String s) {
        int maxLen=0;
        String str="";

        

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub= s.substring(i,j);
                if(isPalindrome(sub) && sub.length()>maxLen ){
                    str=sub;
                    maxLen= sub.length();
                    
                }

            }
        }
        return str;
    }
}