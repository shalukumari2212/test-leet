class Solution {

    public void reverse(int[] nums ,int st ,int end){
         while(st< end){
           int temp = nums[st];
           nums[st]=nums[end];
           nums[end]= temp;
            st++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {        
        // find pivot element
        int n= nums.length;
        int pivot=-1;
        for(int i=n-2 ;i>=0 ;i--){
            if(nums[i]< nums[i+1]) {
                pivot =i;
                break;
            }
        }

        // agar pivot not found then
        if(pivot == -1){
            reverse(nums , 0 , n-1);
            return;
        //    int st=0;
        //    int end= n-1;
        //    while(st<= end){
        //     swap(nums[st] ,nums[end]);
        //     st++;
        //     end--;
        //    }
        }

        // find next largetst and swap number
        for(int i=n-1 ; i>pivot ;i--){
            if(nums[i] > nums[pivot]){              
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] =temp;
                break;
            }
            
        }
        reverse(nums , pivot+1 , n-1);
        // reverse the loop
        // int st=pivot;
        // int end= n-1;
        // while(st<= end){
        //     swap(nums[st] , nums[end]);
        //     st++;
        //     end--;
        // }
    }
}