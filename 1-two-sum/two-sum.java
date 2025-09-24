class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             int a[]={i,j};
        //             return a;
        //         }
        //     }
        // }
        // return null;
        HashMap<Integer,Integer>mp= new HashMap<>();
        int []ans= {-1};
        for(int i=0;i<nums.length;i++){
            int partner= target - nums[i];
            if(mp.containsKey(partner)){
                ans= new int[]{i, mp.get(partner)};
                return ans;
            }
            else{
                mp.put(nums[i],i);
            }
           
        }
         return ans;

    }
}
        