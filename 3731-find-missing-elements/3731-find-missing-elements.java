class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int low = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int high = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > high) {
                high = nums[i];
            }
            if (nums[i] < low) {
                low = nums[i];
            }

        }
        for(int x : nums ){
            set.add(x);
        }
        for(int i = low;i<high+1;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;

    }
}