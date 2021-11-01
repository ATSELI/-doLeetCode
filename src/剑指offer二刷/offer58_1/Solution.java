package 剑指offer二刷.offer58_1;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/27 13:23
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，
 * 标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        while (true){
            String a = new String("a");
        }
    }
    public String reverseWords(String s) {
        s = s.trim();
        String[] strings = s.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            builder.append(strings[i]).append(" ");
        }
        return builder.toString().trim();
    }


    public String reverseWords2(String s) {
        String[] s1 = s.trim().split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i --){
            if (!"".equals(s1[i])){
                builder.append(s1[i]).append(" ");
            }
        }
        return builder.toString().trim();
    }
}
