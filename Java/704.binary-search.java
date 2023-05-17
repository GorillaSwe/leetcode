/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int output = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                output = i;
            return output;
        }
        return output;
    }
}
// @lc code=end
