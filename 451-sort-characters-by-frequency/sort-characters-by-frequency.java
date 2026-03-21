class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length() ;i++){
            char ch= s.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1) ;
        }
        
        // list bnaye (map key set)  use kiye->sare unique characters deta h
        List<Character>list = new ArrayList<>(map.keySet()); 
        Collections.sort(list , (a,b) -> map.get(b) - map.get(a) ); // sort kiye char ko freq ke acc


        StringBuilder ans = new StringBuilder();

        for(char ch : list){
            int freq = map.get(ch);

            while(freq>0){
                ans.append(ch);
                freq--;
            }

        }
        return ans.toString();




        
    }
}