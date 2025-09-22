class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;

        // HashMap<Character,Integer>mp= new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char ch= s.charAt(i);
        //     if(!mp.containsKey(ch)){
        //         mp.put(ch,1);
        //     }
        //     else{
        //         int currfreq= mp.get(ch);
        //         mp.put(ch,currfreq+1);
        //     }
        // }
        // // decrrease the frequency
        // for(int i=0;i<t.length();i++){
        //     char ch= t.charAt(i);
        //     if(!mp.containsKey(ch)) return false;
        //     int curr= mp.get(ch);
        //     mp.put(ch, curr-1);
        // }
        // for(var i: mp.values()){
        //     if(i !=0) return false;
        // }
        // return true;
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer>mp1= myHashMap(s);
        HashMap<Character,Integer>mp2= myHashMap(t);
        return mp1.equals(mp2);
    }
     static HashMap<Character,Integer> myHashMap(String str){
        HashMap<Character,Integer> mp= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int currFreq= mp.get(ch);
                mp.put(ch, currFreq+1);
            }
        }
        return mp;
    }
};
    