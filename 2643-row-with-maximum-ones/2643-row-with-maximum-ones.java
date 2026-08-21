class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int sum = 0;
        int maxx = 0;
        int index = 0;

        int row = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            if (sum > maxx) {
                maxx = sum;
                index = i;

            }

        }
        return new int[] { index, maxx };
    }
}