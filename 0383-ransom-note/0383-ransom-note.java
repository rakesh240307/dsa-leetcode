class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int z = ransomNote.length();
        int k = magazine.length();
        int[] arr =  new int[26];

        for(int i = 0 ;i<k;i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i = 0;i<z;i++){
            arr[ransomNote.charAt(i)-'a']--;
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<0){
                return false;
            }
        }
        return true;
    }
}