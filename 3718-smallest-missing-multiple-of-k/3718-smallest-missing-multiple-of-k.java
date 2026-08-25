class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i< nums.length ; i++){
            set.add(nums[i]);
        }
        int num = 0 ; 
        for(int i= 0 ; i< nums.length; i++){
            num += k;
            if(!set.contains(num)){
                return num ;
            }

        }
        return num + k ;
        
    }
}