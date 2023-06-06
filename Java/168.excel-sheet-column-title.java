/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder output = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char tmp = (char) (columnNumber % 26 + 'A');
            output.append(tmp);
            columnNumber = columnNumber / 26;
        }
        output.reverse();
        return output.toString();
    }
}
// @lc code=end
