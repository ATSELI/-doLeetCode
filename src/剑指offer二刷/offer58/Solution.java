package 剑指offer二刷.offer58;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/17 12:32
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String reverseLeftWords(String s, int n) {
        if (n >= s.length()){
            return s;
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = n; i < chars.length; i++) {
            builder.append(chars[i]);
        }
        for (int i = 0; i < n; i++) {
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}
