class Solution {
    public int gcd(int sumE, int sumO) {
        if (sumO == 0) {
            return sumE;
        }
        return gcd(sumO, sumE % sumO);
    }

    public int gcdOfOddEvenSums(int n) {
        int sumO = n * n;
        int sumE = n * (n + 1);

        return gcd(sumE, sumO);

    }
}