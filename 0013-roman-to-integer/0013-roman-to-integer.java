class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        map1.put('I', 1);
        map1.put('V', 5);
        map1.put('X', 10);
        map1.put('L', 50);
        map1.put('C', 100);
        map1.put('D', 500);
        map1.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map1.get(s.charAt(i));
            if (i < s.length() - 1) {
                int next = map1.get(s.charAt(i + 1));
                if (curr < next) {
                    sum -= curr;
                } else {
                    sum += curr;
                }
                

            }
            else{
                    sum+=curr;
                }
        }
        return sum;

    }
}