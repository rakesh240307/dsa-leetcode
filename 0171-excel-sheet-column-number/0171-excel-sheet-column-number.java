class Solution {
    public int titleToNumber(String columnTitle) {
        int value = 0 ;
        for(int i= 0 ; i< columnTitle.length();i++){
            int k = columnTitle.charAt(i)-'A'+1;
            value = value*26+k;

        }
        return value;
        
    }
}