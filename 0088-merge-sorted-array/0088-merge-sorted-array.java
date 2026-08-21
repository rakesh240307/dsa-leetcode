class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int i = 0 ;
        int j = 0;
        int count = 0;
        while(i<m && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[count]=nums1[i];
                i++;
                count++;
            }
            else{
                arr[count]=nums2[j];
                j++;
                count++;
            }
        }
        while(i<m){
            arr[count]=nums1[i];
            count++;
            i++;
        }
        while(j<n){
            arr[count]=nums2[j];
            j++;
            count++;

        }
        int k = 0;
        for(int x : arr){
            nums1[k]=x;
            k++;
            
        }


        
    }
}