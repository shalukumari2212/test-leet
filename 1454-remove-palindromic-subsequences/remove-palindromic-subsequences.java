class Solution {
    public int removePalindromeSub(String s) {
        int st=0;
        int end= s.length()-1;
        while(st<end){
            if(s.charAt(st) ==  s.charAt(end)){
                st++;
                end--;
            }
            else{
                return 2;
            }

        }
        return 1;
    }
}