class Solution {
    public int compress(char[] chars) {
        
        int i = 0 ;
        int j = 0 ;
        while(i<chars.length){
            char current = chars[i];
            int count = 0 ;
             while(i<chars.length && chars[i]==current){
             i++;
             count++;

            }
            chars[j]=current;
            j++;
            if(count>1){
                String s = String.valueOf(count);
                for(int m =0;m<s.length();m++){
                    chars[j]=s.charAt(m);
                    j++;
                }
            }

        
        }
        return j;
    }
}