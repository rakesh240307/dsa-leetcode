
class Solution {
    public int kthFactor(int n, int k) {
        // Find factors in ascending order up to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                k--;

                if (k == 0) {
                    return i;
                }
            }
        }

        // Check larger factors in descending order
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                k--;

                if (k == 0) {
                    return n / i;
                }
            }
        }

        return -1;
    }
}
