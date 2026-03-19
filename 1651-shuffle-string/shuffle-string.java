class Solution {
    public String restoreString(String s, int[] arr) {
        HashMap<Integer,Character>map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char ch= s.charAt(i);            
            map.put(arr[i],ch);
        }

        String str="";

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(i)){
                str+=map.get(i);
            }
        }
        return str;
    }
}