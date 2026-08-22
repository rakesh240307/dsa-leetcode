class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();

        int i = 0 ;

        int j = 0 ;
        while(i<chars.length && j <chars.length){
            int count = 0 ;
            while( j<chars.length && chars[i]==chars[j] ){
                j++;
                count++;
            }
            if(count==1){
                sb.append(chars[i]);
            }
            if(count>1){
                sb.append(chars[i]);
                sb.append(count);
                
                
            }
            i=j;
        }
        String s = sb.toString();
        for(int m = 0 ;m<s.length();m++){
            chars[m]=s.charAt(m);

        }
        return s.length();
       
        
    }
}