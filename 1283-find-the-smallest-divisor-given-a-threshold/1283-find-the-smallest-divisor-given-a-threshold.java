class Solution {
    public int d(int n,int[] nums){
        int sum = 0 ; 
        for(int i = 0 ; i<nums.length;i++){
            sum += nums[i]/n;
            if(nums[i]%n!=0){
                sum++;
            }
        }
        return sum ;
    }
    public int largest(int[] nums){
        int a = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]>a){
                a = nums[i];
            }
        }
        return a ;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1 ;
        int right = largest(nums);
        int ans = -1;
        while(left <= right ){
            int mid = (left + right)/2;
            if(d(mid,nums)<=threshold){
                ans = mid;
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return ans ;

        
    }
}