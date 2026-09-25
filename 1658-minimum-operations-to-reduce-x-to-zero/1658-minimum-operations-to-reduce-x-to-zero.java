class Solution {
    public int minOperations(int[] nums, int x) {
        if(nums.length==1){
            if(nums[0]==x){
                return 1;
            }
            else{
                return -1;

            }
        }
        if(nums[0]>x && nums[nums.length-1]>x){
            return -1;
        }
        int left = 0 ;
        int right = 0;
        int sum = 0 ;
        for(int i : nums){
            sum+=i;

        }
        int target = sum-x;
        if(target==0){
            return nums.length;
        }
        if(target<0){
            return -1;
        }
        int maxlen = -1;
        int k = 0 ;

        while(right<nums.length){
            k+=nums[right];
             while(k>target){
                k -= nums[left];
                left++;
            }
            if(k==target){
                maxlen = Math.max(maxlen,right-left+1);
            }
           
                right++;
            
            

        }
        if(maxlen==-1){
            return -1;
        }
        return nums.length-maxlen;


        
    }
}