class Solution {
    public double avg(int n,int[] nums){
        double z = 0.0;
        double count = 0.0;
        for(int i = n+1 ;i<nums.length;i++){
            z += nums[i];
            count++;
            
        }
        return z/count;
    }
    int count1 = 0 ;
    public int dominantIndices(int[] nums) {
        for(int i = 0 ; i< nums.length;i++){
            if(nums[i]>avg(i,nums)){
                count1++;
            }
        }
        return count1;
        
    }
}