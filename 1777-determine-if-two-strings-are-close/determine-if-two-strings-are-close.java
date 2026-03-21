class Solution {
    
    public boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length())  return false;
        
        HashMap<Character ,Integer>mp= new HashMap<>();
        HashMap<Character ,Integer>mt= new HashMap<>();

       // map me freq  put kr  diye hr char ka -> freq count
        for(char ch : word1.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
      
        for(char ch : word2.toCharArray()){
            mt.put(ch,mt.getOrDefault(ch,0)+1);
        }
 
       //key same h ya nhi dono string ka
        if( !mp.keySet().equals(mt.keySet())) return false;       

        //list me freq put kro char ka
        List<Integer>list1 = new ArrayList<>(mp.values());      
        List<Integer>list2 = new ArrayList<>(mt.values());
         
        // list ko sort kro ascen freq ke according 
        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
       
    }
}