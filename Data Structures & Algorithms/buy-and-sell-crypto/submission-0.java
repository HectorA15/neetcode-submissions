class Solution {
    public int maxProfit(int[] prices) {
        
        int buyPrice = prices[0];
        int actualPrice = 0;

        int maxProfit = 0;
        int actualProfit = 0;

        for (int price : prices){

            actualProfit = Math.max(price - buyPrice, 0) ;


            if(buyPrice > price){
                buyPrice = price;
            }

            if ( actualProfit > maxProfit){
                maxProfit = actualProfit;
            }

        }

        return maxProfit;
    }
}
