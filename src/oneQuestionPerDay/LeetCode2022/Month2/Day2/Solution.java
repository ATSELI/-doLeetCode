package oneQuestionPerDay.LeetCode2022.Month2.Day2;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/2/2 22:41
 * 给你一个下标从 0 开始的字符串 word 和一个字符 ch 。找出 ch 第一次出现的下标 i ，
 * 反转 word 中从下标 0 开始、直到下标 i 结束（含下标 i ）的那段字符。如果 word 中不存在字符 ch ，则无需进行任何操作。
 *
 * 例如，如果 word = "abcdefd" 且 ch = "d" ，那么你应该 反转 从下标 0 开始、直到下标 3 结束（含下标 3 ）。结果字符串将会是 "dcbaefd" 。
 * 返回 结果字符串 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-prefix-of-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        char temp;
        for (int i = 0; i < chars.length; ++i){
            if (chars[i] == ch){
                for (int j = 0; j <= i / 2; j++){
                    temp = chars[j];
                    chars[j] = chars[i-j];
                    chars[i-j] = temp;
                }
                break;
            }
        }
        return new String(chars);
    }
}
