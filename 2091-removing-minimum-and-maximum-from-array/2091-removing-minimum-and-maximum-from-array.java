class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return 1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find min and max
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int count = 1;
        int countt = 1;

        // Position of max from front
        for (int i = 0; i < n; i++) {
            if (nums[i] == max) {
                break;
            }
            count++;
        }

        // Position of min from front
        for (int i = 0; i < n; i++) {
            if (nums[i] == min) {
                break;
            }
            countt++;
        }

        // Both from front
        int start = Math.max(count, countt);

        // Both from back
        int back = Math.max(
            n - count + 1,
            n - countt + 1
        );

        // max from front, min from back
        int mid1 = count + (n - countt + 1);

        // min from front, max from back
        int mid2 = countt + (n - count + 1);

        int mid = Math.min(mid1, mid2);

        return Math.min(start, Math.min(back, mid));
    }
}