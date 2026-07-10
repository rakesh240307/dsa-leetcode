import java.util.*;

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        HashSet<Integer> set = new HashSet<>();

        // Store all numbers
        for (int num : nums) {
            set.add(num);
        }

        int count = 0;

        // Check every number as the first element
        for (int x : nums) {

            if (set.contains(x + diff) &&
                set.contains(x + 2 * diff)) {

                count++;
            }
        }

        return count;
    }
}