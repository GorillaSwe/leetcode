import java.util.Deque;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                deque.push(c[i]);
            } else {
                if (c[i] == ')' && !deque.isEmpty()) {
                    if (deque.peek() == '(') {
                        deque.pop();
                    } else
                        return false;
                } else if (c[i] == ']' && !deque.isEmpty()) {
                    if (deque.peek() == '[') {
                        deque.pop();
                    } else
                        return false;
                } else if (c[i] == '}' && !deque.isEmpty()) {
                    if (deque.peek() == '{') {
                        deque.pop();
                    } else
                        return false;
                } else
                    return false;
            }
        }
        if (deque.isEmpty())
            return true;
        else
            return false;
    }
}
// @lc code=end
