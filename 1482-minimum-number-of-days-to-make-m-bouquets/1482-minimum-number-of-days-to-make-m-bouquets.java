class Solution {

    public int maxDay(int[] bloomDay) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
        }

        return max;
    }

    public boolean canMake(int[] bloomDay, int m, int k, int day) {

        int flowers = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        // Impossible to make m bouquets
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int left = 1;
        int right = maxDay(bloomDay);

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                // mid works, try fewer days
                right = mid - 1;
            } else {
                // mid doesn't work, need more days
                left = mid + 1;
            }
        }

        return left;
    }
}