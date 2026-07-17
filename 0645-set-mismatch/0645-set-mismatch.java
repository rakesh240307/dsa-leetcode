class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int num = 0 ;
        int dup = 0 ;
        for(int i = 0 ; i<n ; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                dup = Math.abs(nums[i]);
            }
            else{
                nums[index]=-nums[index];
            }

        }
        for(int i = 0;i<n;i++){
            if(nums[i]>0){
                num = i+1;
                break;
                
            }
        }
        return new int[]{dup,num};


        
    }
}