class Solution {
    public boolean consecutiveSetBits(int n) {

        int count = 0;

        while (n > 0) {

            if ((n & 3) == 3) { // last two bits are 11
                count++;
            }

            n >>= 1; // shift right by 1 bit
        }

        return count == 1;
    }
}