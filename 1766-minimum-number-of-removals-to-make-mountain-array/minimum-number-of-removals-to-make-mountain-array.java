class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n= nums.length;
        int maxlen=1;
        int[] dp1= new int[n];
        int[] dp2= new int[n];
        for(int i=0;i<n;i++){
            dp1[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j]){
                    dp1[i] = Math.max(dp1[i] , 1+dp1[j]);
                }
            }
           
        }
        for(int i=n-1;i>=0;i--){
            dp2[i]=1;
            for(int j=n-1;j>i;j--){
                if(nums[i] > nums[j]){
                    dp2[i] = Math.max(dp2[i] , 1+dp2[j]);
                }
            }
           
        }
        
        int max=0;
        for(int i=0;i<n;i++){
            if(dp1[i]>1 && dp2[i]>1){
                int ans= dp1[i]+dp2[i]-1;
                max= Math.max(max,ans);
            }
        }
        return n-max;


       
    }
}