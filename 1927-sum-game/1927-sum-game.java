class Solution {
    public boolean sumGame(String num) {
        int count1 = 0 ;
        int count2 = 0 ; 
        int sum1 = 0 ; 
        int sum2 = 0 ;

        for(int i = 0 ; i< num.length()/2;i++){
            if(num.charAt(i)=='?'){
                count1++;
            }
            else{
                sum1 += num.charAt(i)-'0';
            }

        }
        for(int i = num.length()/2;i<num.length();i++){
             if(num.charAt(i)=='?'){
                count2++;
            }
            else{
                sum2 += num.charAt(i)-'0';
            }

        }
        if(count1+count2==0){
            if(sum1==sum2){
                return false;
            }
            else{
                return true;
            }
        }
        if(count1==count2){
             if(sum1==sum2){
                return false;
            }
            else{
                return true;
            }

        }
        if(2*(sum2-sum1)==9*(count1-count2)){
            return false;
        }
        return true;
        
        
        
    }
}