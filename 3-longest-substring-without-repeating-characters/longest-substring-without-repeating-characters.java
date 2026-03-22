class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map= new HashMap<>();
        int l=0;
        int r=0;
        int maxLen=0;
        int n= s.length();
        while(r<n){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r)) >= l){
                    l= map.get(s.charAt(r))+1;
                }
            }
            int len= r-l+1;
            maxLen = Math.max(maxLen ,len);
            map.put(s.charAt(r) , r);
            r++;
        }
        return maxLen;
        
    }
}