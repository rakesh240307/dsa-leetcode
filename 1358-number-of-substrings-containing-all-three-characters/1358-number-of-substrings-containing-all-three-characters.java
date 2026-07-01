class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();

        int[] freq = new int[3];

        int i = 0;
        int ans = 0;

        for (int j = 0; j < n; j++) {

            
            freq[s.charAt(j) - 'a']++;

            
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {

                // Count all valid substrings starting at i
                ans += (n - j);

                // Remove leftmost character
                freq[s.charAt(i) - 'a']--;

                // Shrink window
                i++;
            }
        }

        return ans;
    }
}