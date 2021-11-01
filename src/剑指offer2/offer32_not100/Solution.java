package 剑指offer2.offer32_not100;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/18 9:26
 * 给定两个字符串 s 和 t ，编写一个函数来判断它们是不是一组变位词（字母异位词）。
 * <p>
 * 注意：若s 和 t中每个字符出现的次数都相同且字符顺序不完全相同，则称s 和 t互为变位词（字母异位词）。
 * 示例1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 示例 3:
 * 输入: s = "a", t = "a"
 * 输出: false
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/dKk3P7
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isAnagram("anagram", "nagaram");
    }
    public boolean isAnagram(String s, String t) {
        int length;
        if ((length = s.length()) != t.length() || s.equals(t)){
            return false;
        }
        int[] chars = new int[26];
        for (int i = 0; i < length; i++){
            ++chars[s.charAt(i) - 'a'];
            --chars[t.charAt(i) - 'a'];
        }
        for (int num: chars){
            if (num != 0){
                return false;
            }
        }
        return true;







        // if (s.length() != t.length() || s.equals(t)) {
        //     return false;
        // }
        // Map<Character, Integer> map = new HashMap<>();
        // char[] sChar = s.toCharArray();
        // char[] tChar = t.toCharArray();
        // for (int i = 0; i < s.length(); i++) {
        //     map.put(sChar[i], map.containsKey(sChar[i]) ? map.get(sChar[i]) + 1 : 1);
        // }
        // for (int i = 0; i < t.length(); i++){
        //     if (!map.containsKey(tChar[i])){
        //         return false;
        //     }
        //     map.put(tChar[i], map.get(tChar[i]) - 1);
        //     if (map.get(tChar[i]) < 0){
        //         return false;
        //     }
        // }
        // return true;
    }
}
