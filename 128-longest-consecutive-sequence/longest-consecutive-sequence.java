class Solution {
   public int findmax(HashMap<Integer,Boolean>map , int key){
            int ans=0;
            while(map.containsKey(key)){              
                key++;
                ans++;             
            }
            return ans;
        }
    
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        HashMap<Integer,Boolean> map= new HashMap<>();

        // put all value in map with all true kyes
        for(int val : nums){
            map.put(val, true);
        }

        //ab true ko false map krenge if prev elemt exit  krta h to
        for(int i=0 ;i<n ;i++){
            if( map.containsKey(nums[i]-1)){
                map.put(nums[i] , false);
            }
        }

        int max=0;

        for(int key : map.keySet()){
            if(map.get(key) == true){
                max= Math.max(max, findmax(map, key));
            }
        }
        

     return max;

    }
}



        // int max=0;
        // Arrays.sort(nums);

        // for(int i=0;i<nums.length-1;i++){
        //     int count=0;
        //     if(nums[i+1] == nums[i]+1) {
        //         count++;}
        //         max= Math.max(count, max);
            
           
        // }
        // return max;
    
