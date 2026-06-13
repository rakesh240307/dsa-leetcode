class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
       
        int i = 0;
        int j = nums.length/2;
        int count=0;
        while(j<nums.length){
            arr[count]=nums[i];
            count++;
            arr[count]=nums[j];
            count++;
            i++;
            j++;
            
        }
        return arr;
        
    }
}