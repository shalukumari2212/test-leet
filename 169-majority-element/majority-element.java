class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int num :nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        // int max=0;
        // int ans=0;
        // for(int key : map.keySet()){
        //     if(map.get(key)>max){
        //         max=map.get(key);
        //         ans= key;
        //     }
        // }
        // return ans;

        int n= nums.length;
       
        for(int key : map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
}