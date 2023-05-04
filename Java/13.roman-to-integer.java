import java.util.HashMap;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] c = s.toCharArray();
        int output = 0;
        char prev = '0';
        for(int i=0;i<c.length;i++){
            if(c[i] == 'V' && prev == 'I'){
                output += 3;
            } else if(c[i] == 'X' && prev == 'I'){
                output += 8;
            } else if(c[i] == 'L' && prev == 'X'){
                output += 30;
            } else if(c[i] == 'C' && prev == 'X'){
                output += 80;
            } else if(c[i] == 'D' && prev == 'C'){
                output += 300;
            } else if(c[i] == 'M' && prev == 'C'){
                output += 800;
            } else {
                output += map.get(c[i]);
            }
            prev = c[i];
        }

        return output;
    }
}
// @lc code=end

