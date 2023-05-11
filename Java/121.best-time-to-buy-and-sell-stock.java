/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int turn = 0;
        int diff = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
                turn = i;
            }
            if (turn < i && min < prices[i]) {
                if (diff < prices[i] - min)
                    diff = prices[i] - min;
            }
        }
        return diff;
    }
}
// @lc code=end
