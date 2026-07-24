class Solution {
    public boolean isAnagram(String s, String t) {
        int i = s.length();
        int j = t.length();
        if (i != j) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int a = 0; a < i; a++) {
            char ch = s.charAt(a);
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }

        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int a = 0; a < i; a++) {
            char ch = t.charAt(a);
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }

        }
        if (map1.equals(map2)) {
            return true;
        }
        return false;

    }
}