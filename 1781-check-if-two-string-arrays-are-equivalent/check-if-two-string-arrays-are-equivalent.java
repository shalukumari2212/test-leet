class Solution {
    public String isString(String[]str){
        String s="";
        for(int i=0;i<str.length; i++){
            s+= str[i];
           
        }
        return s;
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str =isString(word1);
        String gtr =isString(word2);
        return str.equals(gtr);

    }
}