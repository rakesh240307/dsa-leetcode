class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length-1;
        int i = 0;
        int j = 0;
        int k = n;
        while(j<=k){
            if(nums[j]==0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else if(nums[j]==1){
                j++;
            }
            else{
                int two = nums[k];
                nums[k]=nums[j];
                nums[j]= two;
                k--;

            }
        }


        
    }
}