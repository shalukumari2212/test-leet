// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>>set= new HashSet<>();
//         int n= nums.length;
//         for(int i=0;i<n;i++){
//             int tar= -(nums[i]);
//             Set<Integer>s= new HashSet<>();
//             for(int j=i+1;j<n;j++){
//                 int third= tar-nums[j];
                
//                 if(s.contains(third)) {
//                     List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
//                     Collections.sort(triplet);
//                     set.add(triplet);
//                 }
//                 s.add(nums[j]);
//             }
//         }
//         List<List<Integer>>ans= new ArrayList<>(set);
//         return ans;
        
//     }
// }
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n= nums.length;
      Arrays.sort(nums);
       List<List<Integer>>ans = new ArrayList<>();
       for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;

        int j=i+1 ,k= n-1;

        while(j<k){
            int sum= nums[i]+nums[j]+nums[k];

            if(sum<0) j++;
            else if(sum>0) k--;
            else {
                // List<List<Integer>>ans= Arrays.asList(nums[i],nums[j],nums[k]);
                ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
                while(j<k && nums[j]==nums[j-1]) j++;
                 while(j < k && nums[k] == nums[k+1]) k--;
            }
          
        }
       }
       return ans;

    }
}