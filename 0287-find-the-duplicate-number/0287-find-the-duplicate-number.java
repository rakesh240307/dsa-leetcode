class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length-1];
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = -1;

        }
        for(int i = 0 ;i< nums.length;i++){
            if(arr[nums[i]-1]==-1){
            arr[nums[i]-1]=0;
            }
            else{
                return nums[i];
            }
        }
        return 0;
        
        
        
    }
}