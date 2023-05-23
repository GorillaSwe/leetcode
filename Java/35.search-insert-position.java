/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int output = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
            if (nums[i] > target)
                return i;
        }
        return output;
    }
}
// @lc code=end
