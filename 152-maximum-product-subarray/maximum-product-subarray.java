class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int max=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix *= nums[i]; 
            suffix *= nums[n-i-1]; 
            max= Math.max(max , Math.max(suffix , prefix));

        }
        return max;


        // int[]prefixProd = new int[n];
        // prefixProd[0]=nums[0];
        // int max= prefixProd[0];
        // for(int i=1;i<n;i++){
        //     prefixProd[i]= prefixProd[i-1]* nums[i];
        //     max= Math.max(prefixProd[i] ,max);
        // }
        // return max;
    }
}