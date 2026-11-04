class Solution {
    public int minMoves(int[] nums) {
        int max = -1;

        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            
        }
        int count = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]<max){
                count+=max-nums[i];
            }
        }
        return count;
        
    }
}