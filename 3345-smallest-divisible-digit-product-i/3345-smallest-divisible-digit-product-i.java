class Solution {
    public int num(int k ){
        int p  = 1;
        while(k>0){
            
            int z = k%10;
            
             p *= z;
            k = k/10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        if(num(n)%t==0){
            return n;
        }
        while (true) {

            if (num(n) % t == 0) {
                return n;
            }

            n++;
        }
        
    }
}