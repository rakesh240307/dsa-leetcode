class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i = 0 ;
        int j = nums.length-1;
        int[] arr = new int[nums.length];
        int count = nums.length-1;
        while(i<=j && count>=0){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
            if(left>right){
                arr[count]=left;
                i++;
            }
            else{
                arr[count]=right;
                j--;

            }
            count--;
        } 
        return arr;
    
    }
}