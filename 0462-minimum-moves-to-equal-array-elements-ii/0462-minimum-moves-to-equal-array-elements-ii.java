
import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);

        int median = nums[nums.length / 2];

        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += Math.abs((long) nums[i] - median);
        }

        return (int) count;
    }
}
