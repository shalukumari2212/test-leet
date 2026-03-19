class Solution {
    public void helper(HashMap<Character,Integer> mp ,String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            mp.put(ch , mp.getOrDefault(ch ,0)+1);
        }

    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<Character,Integer> mt = new HashMap<>();

        helper(mp,s);
        helper(mt,t);
        
        if(mp.equals(mt)) return true;
        else return false;
        
    }
};
    