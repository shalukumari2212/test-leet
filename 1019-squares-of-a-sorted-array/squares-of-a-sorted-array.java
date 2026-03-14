class Solution {
     public void mergesort(int [] arr ,int low,int mid,int high){
        int la= mid-low+1;
        int lb= high-mid;

        int []a=new int[la];
        int []b=new int[lb];

        for(int i=0;i<la;i++){
            a[i]=arr[low+i];
        }
        for(int i=0;i<lb;i++){
            b[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=low;
        while(i<la && j<lb){
            if(a[i]<b[j]){
                arr[k]=a[i];
                i++;
            }
            else{
                arr[k]=b[j];
                j++;
            }
            k++;

        }
        while(i<la){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<lb){
            arr[k]=b[j];
            j++;
            k++;
        }

    }
    public void merge(int [] arr ,int low,int high){
        if(low>=high) return;
        int mid= (low+high)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        mergesort(arr,low,mid,high);
    }
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]= (nums[i] * nums[i]);
        }
        merge(nums,0,n-1);
        return nums;
        
    }
}