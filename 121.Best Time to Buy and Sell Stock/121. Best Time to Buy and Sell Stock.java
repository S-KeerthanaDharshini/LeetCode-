class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int max = Integer.MIN_VALUE;
        int n = prices.length;
        int diff = 0;
        for(int i =0 ;i<n;i++){
           diff = prices[i] - minimum;
           max = (diff > max)? diff :max;
           minimum = (minimum > prices[i])?prices[i]:minimum;
        }
        return max;
    }
}