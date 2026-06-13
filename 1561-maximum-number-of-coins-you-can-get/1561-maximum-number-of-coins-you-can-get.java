class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int k = piles.length / 3;
        int sum = 0;

        for (int i = piles.length - 2; k > 0; i -= 2) {
            sum += piles[i];
            k--;

        }
        return sum;

    }
}