/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();

        if(x < 0) return false;
        else {
            for(int i=0;i<n/2;i++){
                if(s.charAt(i) != s.charAt(n-i-1)) return false;
            }
            return true;
        }
    }
}
// @lc code=end

