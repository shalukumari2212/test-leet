// class Solution {
//     public int search(int[] nums, int target) {
//         HashMap<Integer, Integer> mp= new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             mp.put(nums[i], i);
//         } 
//         if(mp.containsKey(target)){
//             return mp.get(target);
//         }
//         else return -1;
        
//     }

// }
class Solution {
    public int search(int[] nums, int target) {
   
    if(nums.length==0){
        return -1;
    }
    int low=0;
    int high=nums.length-1;
    // int mid=0;
    
    while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        // if true this part is sorted
      if  ( nums[low]<=nums[mid]){
        if(nums[low]<=target && target<nums[mid]){
            high=mid-1;
        }
      
        else{
            low=mid+1;
        }
    }
        else{
                if(nums[mid]<target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            
        }
        
      
            
           
    
    }
    return -1;
    }
 
}