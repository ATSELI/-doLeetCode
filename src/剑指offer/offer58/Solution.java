package 剑指offer.offer58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/5 10:30
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aaa   bbb   cccc  ddd";
        String[] s1 = s.trim().split("\\s+");
        for (String s2: s1){
            System.out.println(s2);
            System.out.println(" ".equals(s2));
        }
    }

    /**
     * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * <p>
     * 示例1
     * 输入: "the sky is blue"
     * 输出: "blue is sky the"
     * <p>
     * 示例2
     * 输入: "  hello world!  "
     * 输出: "world! hello"
     * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
     * <p>
     * 示例3
     * 输入: "a good  example"
     * 输出:"example good a"
     * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
     */

    // 7ms
    public String reverseWords(String s) {
        // 正则表达式,可以切割一个或多个空格
        // String[] s1 = s.trim().split("//s+");
        String[] s1 = s.trim().split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i --){
            if (!"".equals(s1[i])){
                builder.append(s1[i]).append(" ");
            }
        }
        return builder.toString();



        // 题解 1ms
        // String[] s1 = s.trim().split(" ");
        // StringBuilder builder = new StringBuilder();
        // for (int i = s1.length - 1; i >= 0; i--) {
        //     if ("".equals(s1[i])){
        //         continue;
        //     }
        //     builder.append(s1[i]).append(" ");
        // }
        // return builder.toString().trim();
    }
}
