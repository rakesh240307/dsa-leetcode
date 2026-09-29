class Solution {
    public int findLucky(int[] arr) {
        int[] nums = new int[501];
        int max = -1 ; 
        for(int i = 0 ; i< arr.length ;i++){
            nums[arr[i]]++;
        }
        for(int i = 1; i<501;i++){
            if(nums[i]==i){
                max = Math.max(max,nums[i]);
            }
        }

        
        return max;
        
    }
}