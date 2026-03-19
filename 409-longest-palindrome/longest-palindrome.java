class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
        }

        // loop on map to find value
        int length=0;
        boolean isOdd=false;
        for(int freq : map.values()){
            if(freq%2==0) length+= freq;
            else{
                freq=freq-1;                
                length+=freq;
                isOdd= true;
            }
           
        }
         if(isOdd) length+=1;
        return length;


    }
}

 