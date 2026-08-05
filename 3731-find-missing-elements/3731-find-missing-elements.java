class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int low = Integer.MAX_VALUE;
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
        for (int i = low; i <= high; i++) {
            boolean a = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    a = true;
                }
            }
            if (!a) {
                list.add(i);
            }

        }
        return list;

    }
}