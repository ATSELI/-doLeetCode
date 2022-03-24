package oneQuestionPerDay.LeetCode2022.Month1.Day5;

import java.util.Random;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/1/13 17:18
 * 给你一个仅包含小写英文字母和 '?' 字符的字符串 s，请你将所有的 '?' 转换为若干小写字母，使最终的字符串不包含任何 连续重复 的字符。
 * <p>
 * 注意：你 不能 修改非 '?' 字符。
 * <p>
 * 题目测试用例保证 除 '?' 字符 之外，不存在连续重复的字符。
 * <p>
 * 在完成所有转换（可能无需转换）后返回最终的字符串。如果有多个解决方案，请返回其中任何一个。可以证明，在给定的约束条件下，答案总是存在的。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String modifyString(String s) {
        int len = s.length();
        char[] cha = s.toCharArray();
        for (int i = 0; i < len; ++i) {
            if (cha[i] == '?') {
                for (char ch = 'a'; ch <= 'c'; ch++){
                    if ((i > 0 && ch == cha[i - 1]) || (i < len - 1  && ch == cha[i + 1])){
                        continue;
                    }
                    cha[i] = ch;
                }
            }
        }
        return new String(cha);
    }
}
