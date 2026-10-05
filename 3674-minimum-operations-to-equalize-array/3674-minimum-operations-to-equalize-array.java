class Solution {
    public int minOperations(int[] nums) {
        int a = nums[0];
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=a){
                return 1 ;
            }

        }
        return 0 ;
        
    }
}