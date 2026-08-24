class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit = 0;
        
        // for(int i = 0; i < prices.length - 1; i++){
        //     int j = prices.length - 1;
        //     while(j > i){
        //        maxProfit = prices[j] - prices[i] > maxProfit ? prices[j] - prices[i]  : maxProfit;
        //        j--;
        //     }
        // }
        // return maxProfit;
         

         int buyP = prices[0], maxP = 0;
         for(int i = 0; i < prices.length; i++){
            if(maxP < (prices[i] - buyP)) maxP = prices[i] - buyP;
            if(prices[i] < buyP) buyP = prices[i];
         }
         return maxP;
    }
}