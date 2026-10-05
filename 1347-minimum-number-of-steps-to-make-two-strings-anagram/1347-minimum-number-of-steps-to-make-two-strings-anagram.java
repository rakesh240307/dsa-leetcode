class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        int[] nums = new int[26];
        for(int i = 0 ; i<s.length();i++){
            int one = s.charAt(i)-'a';
            arr[one]++;
            int two = t.charAt(i)-'a';
            nums[two]++;
        }
        int op  =0;
        for(int i = 0 ; i<26;i++){
            if(arr[i]>nums[i]){
            op+=arr[i]-nums[i];
        }


        }
        return op;

        
    }
}