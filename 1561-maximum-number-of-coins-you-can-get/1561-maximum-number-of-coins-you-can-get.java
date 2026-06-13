class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
            int  k  = (piles.length+1)/3;
            int count = 0;
            int sum = 0;
            for(int i = piles.length-2 ; i>=0;i-=2){
                sum +=piles[i];
                count++;
                if(count == k){
                    break;
                }
            }
         return sum;   

        
        
    }
}