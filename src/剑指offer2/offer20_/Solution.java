package 剑指offer2.offer20_;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/13 22:40
 * 给定一个字符串 s ，请计算这个字符串中有多少个回文子字符串。
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 * 示例 1：
 *
 * 输入：s = "abc"
 * 输出：3
 * 解释：三个回文子串: "a", "b", "c"
 * 示例 2：
 * 输入：s = "aaa"
 * 输出：6
 * 解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/a7VOhD
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 题解
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            count += calculate(s, i, i);
            count += calculate(s, i, i+1);
        }
        return count;
    }
    public int calculate(String s, int start, int end){
        int count = 0;
        while (start >= 0 && end < s.length()  && s.charAt(start) == s.charAt(end)){
            count ++;
            start--;
            end++;
        }
        return count;
    }
}
