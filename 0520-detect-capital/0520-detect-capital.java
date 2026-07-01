class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                cap++;
            }
        }

        if (cap == word.length())      // All letters uppercase
            return true;

        if (cap == 0)                  // All letters lowercase
            return true;

        if (cap == 1 && Character.isUpperCase(word.charAt(0)))
            return true;               // Only first letter uppercase

        return false;
    }
}