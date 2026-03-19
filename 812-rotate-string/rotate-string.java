class Solution {
    public boolean rotateString(String s, String goal) {
        String ans="";
        if(s.length() != goal.length()) return false;
        ans= s+s;
        return ans.contains(goal);

    }
}