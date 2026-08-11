class Solution {
    public long time(int[] piles , int k){

        long hours = 0;
        for(int i = 0 ; i<piles.length;i++){
            hours += piles[i]/k;
            if(piles[i]%k!=0){
                hours++;
            }
        }
        return hours;
    }
    public int mn(int[] piles){
        int a = -1;
        for(int i = 0 ;i<piles.length;i++){
            if(piles[i]>a){
                a = piles[i];
            }
        }
        return a;
    }
    public int minEatingSpeed(int[] piles, int h) {

        int ans = Integer.MAX_VALUE;

        int left = 1 ;
        int right = mn(piles);
        while(left<=right){
            int mid = left+(right-left)/2;
            if(time(piles,mid)<=h){
                ans = mid;
                right = mid-1;


            }
            else{
                left = mid +1;
            }

        }
        return ans;
        
    }
}