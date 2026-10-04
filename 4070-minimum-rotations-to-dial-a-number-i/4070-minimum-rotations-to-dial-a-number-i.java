class Solution {
    public int minRotations(String s) {
        int total = 0 ;
        int val = 0 ;
      

        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            int num = ch-'0';
            int first = Math.abs(num-val);
            int second = 10-first;
            total += Math.min(first , second);
            val = num; 

            
        }
        return total ;
        
    }
}