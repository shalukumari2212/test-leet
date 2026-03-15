class Solution {
    public void mergeSort(int[] nums,int left,int mid ,int right){
        int la=mid-left+1;
        int lb= right-mid;

        int[] a= new int[la];
        int[] b= new int[lb];

        for(int i=0;i<la;i++){
            a[i]= nums[left+i];
        }
        for(int j=0;j<lb;j++){
            b[j]= nums[mid+j+1];
        }
        int i=0,j=0,k=left;
        while(i<la && j<lb){
            if(a[i]<b[j]){
             nums[k]=a[i];
             i++;
            }
            else{
                nums[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<la){
           nums[k]=a[i];
            i++;
            k++; 
        }
        while(j<lb){
           nums[k]=b[j];
            j++;
            k++; 
        }

    }
    public void merge(int[] nums,int left ,int right){
        if(left>=right) return;
        int mid= (left+right)/2;
        merge(nums,left,mid);
        merge(nums,mid+1,right);
        mergeSort(nums,left,mid,right);
    } 
    public void sortColors(int[] nums) {
        int n= nums.length;
        merge(nums,0,n-1);
    }
}