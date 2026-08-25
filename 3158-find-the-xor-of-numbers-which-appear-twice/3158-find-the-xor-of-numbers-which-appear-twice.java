class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }
        int k = 0;
        for(int num : map.keySet()){
            if(map.get(num)==2){
                k = k^num;
            }
        }
       
        return k;

    }
}