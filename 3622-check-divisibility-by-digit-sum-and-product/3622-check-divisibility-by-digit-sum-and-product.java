class Solution {
    public boolean checkDivisibility(int n) {
        if(n<10){
            return false;
        }
        int dig = 0 ;
        int pro=1;
        int num = n;

        while(num>0){
            int k = num%10;

            dig += k;
            pro  *=k;
            num = num/10;

        }
        
        
        if(n%(dig+pro)==0){
            return true;
        }
        return false;

        
    }
}