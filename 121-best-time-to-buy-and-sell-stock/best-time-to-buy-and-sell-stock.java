class Solution {
    public int maxProfit(int[] prices) {
        int minSt = Integer.MAX_VALUE;
        int maxPro = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minSt){
                minSt = prices[i];
            }
            maxPro = Math.max(maxPro, prices[i]-minSt);
        }
        return maxPro;
    }
}