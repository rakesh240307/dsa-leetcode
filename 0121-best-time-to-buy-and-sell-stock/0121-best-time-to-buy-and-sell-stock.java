class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i = 1; i<prices.length;i++){
            int value = prices[i]-buy;
            profit = Math.max(profit,value);
            buy = Math.min(buy,prices[i]);
        }
        return profit;
        
    }
}