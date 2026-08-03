class Solution {
    public int maxProduct(int[] nums) {
        int max = -9999999;
        int max2 = -99999;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                int temp=max;
                max = nums[i];
                max2=temp;
            }
            else if(nums[i]>max2){
                max2 = nums[i];
            }
        }
        return (max-1)*(max2-1);


        
    }
}