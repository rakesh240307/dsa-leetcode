class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        long i = 1;
        long j = x;
        int ans = 1;
        while(i<=j){
            long mid = (i+j)/2;
            if(mid*mid<=x){
                i = mid+1;
                ans = (int)mid;
            }
            else{
                j = mid-1;
            }
        }
        return ans ;
        
    }
}