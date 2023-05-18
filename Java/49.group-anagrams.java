/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList<>();
        HashMap<String, List> map = new HashMap<>();
        for (int num = 0; num < strs.length; num++) {
            String tmp = strs[num];
            char[] stringToChar = tmp.toCharArray();
            Arrays.sort(stringToChar);
            String sortedString = String.valueOf(stringToChar);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList());
            }
            map.get(sortedString).add(tmp);
        }
        return new ArrayList(map.values());
    }
}
// @lc code=end
