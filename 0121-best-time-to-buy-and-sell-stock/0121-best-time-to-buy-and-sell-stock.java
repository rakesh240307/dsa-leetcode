class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length ==1 ){
            return 0 ;
        }
        int purchase = prices[0];
        int max = -999999999 ; 
        for(int i = 1 ; i< prices.length;i++){
            purchase = Math.min(purchase , prices[i]);
            int profit = prices[i]-purchase;
            max = Math.max(profit , max );

        }
        
        return max; 
    }
}