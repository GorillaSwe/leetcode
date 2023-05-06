/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        String output = strs[strs.length - 1];
        for (int i = 0; i < strs.length; i++) {
            for (int j = strs[i].length(); j >= 0; j--) {
                if (output.startsWith(strs[i].substring(0, j))) {
                    output = strs[i].substring(0, j);
                    break;
                }
            }

        }
        return output;
    }
}
// @lc code=end
