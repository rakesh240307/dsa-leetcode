class Solution {
    public int largestPerimeter(int[] nums) {
        int k = nums.length ;
        Arrays.sort(nums);
        for(int i = k-2;i>=1;i--){
            if(nums[i]+nums[i-1]>nums[i+1]){
                return (nums[i]+nums[i+1]+nums[i-1]);
            }

        }
        return 0;
        
    }
}