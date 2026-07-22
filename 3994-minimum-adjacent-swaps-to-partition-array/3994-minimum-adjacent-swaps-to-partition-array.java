class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long ans = 0;
        long MOD = 1000000007L;
        int seenM = 0;
        int seenR = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < a) {
                ans += seenM + seenR;
            }

            else if (nums[i] > b) {
                seenR++;
            }

            else {
                ans += seenR;
                seenM++;

            }
        }
        return (int)(ans % MOD);
        

    }
}