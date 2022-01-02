package oneQuestionPerDay.LeetCode20211222;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/12/22 12:49
 * 给定两个字符串a 和 b，寻找重复叠加字符串 a 的最小次数，使得字符串 b 成为叠加后的字符串 a 的子串，如果不存在则返回 -1。
 * <p>
 * 注意：字符串 "abc"重复叠加 0 次是 ""，重复叠加 1 次是"abc"，重复叠加 2 次是"abcabc"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/repeated-string-match
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int repeatedStringMatch(String a, String b) {
        int length = a.length();
        char[] chars = a.toCharArray();
        String str;
        for (int i = 0 ; i < a.length(); ++i) {
            if (a.charAt(i) == b.charAt(0)){
                str = a.substring(i);
                
            }
        }
        return -1;
    }

}
