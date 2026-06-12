class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ;  
        int min = prices[0];
        int z = 0 ;
        for(int i = 0 ; i<prices.length;i++){
            z = prices[i]-min;
            profit = Math.max(z,profit);
            min = Math.min(min, prices[i]);
        }
        return profit ;
        
    }
}