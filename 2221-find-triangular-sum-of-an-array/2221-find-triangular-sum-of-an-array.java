class Solution {
    static int value = 0 ;

    public void ans(int[] arr){
        if(arr.length == 1){
            value = arr[0];
            return ;
        }
        int[] nums = new int[arr.length-1]; 
        int count = 0;
        for(int i = 0 ; i<=arr.length-2;i++){
            nums[count] = (arr[i]+arr[i+1])%10;
            count++;
        }
        ans(nums);
       

    }
    public int triangularSum(int[] nums) {
        ans(nums);
        return value;
        
    }
}