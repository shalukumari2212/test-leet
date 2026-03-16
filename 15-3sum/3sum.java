class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>set= new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            int tar= -(nums[i]);
            Set<Integer>s= new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third= tar-nums[j];
                
                if(s.contains(third)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                s.add(nums[j]);
            }
        }
        List<List<Integer>>ans= new ArrayList<>(set);
        return ans;
        
    }
}