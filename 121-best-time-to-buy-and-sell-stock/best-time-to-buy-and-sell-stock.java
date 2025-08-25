class Solution {
    public int maxProfit(int[] prices) {
       int maxPro = 0;
       int minSto = Integer.MAX_VALUE;

       for(int i=0; i<prices.length; i++){
        if(prices[i] < minSto){
            minSto = prices[i];
        }
        maxPro = Math.max(maxPro, prices[i]-minSto);
       }
       return maxPro;
    }
}