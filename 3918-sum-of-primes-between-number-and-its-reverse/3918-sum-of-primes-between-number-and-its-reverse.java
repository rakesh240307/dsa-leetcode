class Solution {
    public int sumOfPrimesInRange(int n) {
        int k = 0 ;
        int a = n ;
        while(a>0){
            int z = a%10;
             k = k*10+z;
            a = a/10;

        }
        int sum = 0;
        boolean q = true;
        int  s = Math.min(n,k);
        int l = Math.max(n,k);
        for(int i = s ; i<=l;i++){
            q=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    q=false;
                    break;
                }
            }
            if(q && i !=1){
                sum+=i;
            }

            
        }
        return sum ;

    }
}