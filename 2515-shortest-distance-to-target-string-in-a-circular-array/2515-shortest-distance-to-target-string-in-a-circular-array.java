class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {

        int ans = words.length;

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(target)) {

                int diff = Math.abs(i - startIndex);

                int distance = Math.min(diff, words.length - diff);

                if (distance < ans) {
                    ans = distance;
                }
            }
        }

        if (ans == words.length) {
            return -1;
        }

        return ans;
    }
}