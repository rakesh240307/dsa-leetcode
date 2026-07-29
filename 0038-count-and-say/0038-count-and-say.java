class Solution {
    public String countAndSay(int n) {
        
        if(n ==1){
         
            return "1";
        }
        String curr = "1";
        for(int k = 2;k<=n;k++){
            StringBuilder next = new StringBuilder();
            int i = 0;
            while(i<curr.length()){
                int count = 1;
                while(i+1<curr.length()&&curr.charAt(i)==curr.charAt(i+1)){
                    count++;
                    i++;
                }
                next.append(count);
                next.append(curr.charAt(i));
                i++;
            }
            curr = next.toString();


        }
        return curr;
        
        
    }
}