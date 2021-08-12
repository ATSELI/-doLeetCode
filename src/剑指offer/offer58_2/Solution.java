package 剑指offer.offer58_2;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/12 13:12
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 示例1
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 *
 * 示例2
 * 输入: s = "lrloseumgh", k = 6
 * 输出: "umghlrlose"
 */
public class Solution {
    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     String abcdefg = solution.reverseLeftWords("lrloseumgh", 6);
    //     System.out.println(abcdefg);
    // }

    // 我的
    // public String reverseLeftWords(String s, int n) {
    //     if (s.length() < n){
    //         return s;
    //     }
    //     StringBuilder builder = new StringBuilder();
    //     StringBuilder builder1 = new StringBuilder();
    //     for (int i = 0; i < s.toCharArray().length; i++) {
    //         if (i < n){
    //             builder.append(s.toCharArray()[i]);
    //         }else {
    //             builder1.append(s.toCharArray()[i]);
    //         }
    //     }
    //     builder1.append(builder);
    //     return builder1.toString();
    // }

    // 大佬,1使用切片函数
    // public String reverseLeftWords(String s, int n) {
    //     return s.substring(n, s.length()) + s.substring(0, n);
    // }

    // 2.列表遍历拼接
    public String reverseLeftWords(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            builder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
