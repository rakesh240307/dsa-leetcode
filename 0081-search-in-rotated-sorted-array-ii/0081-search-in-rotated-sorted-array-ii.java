class Solution {
    public boolean search(int[] nums, int target) {
        boolean k = false;
        int left = 0 ;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[left]==nums[right]&&nums[right]==nums[mid]){
                left = left+1;
                right = right-1;
                continue;
            }
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target <=nums[mid]){
                    right = mid-1;

                }
                else{
                    left = mid+1;
                }
            }
            if(nums[mid]<=nums[right]){
                if(nums[mid]<=target && target <= nums[right]){
                    left = mid +1;

                }
                else{
                    right = mid -1;
                }
            }
        }
        return k ;

        
    }
}