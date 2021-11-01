package 剑指offer2.offer02;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/5 18:48
 * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class Solution {
    // public static void main(String[] args) {
    //     String str = "";
    //     char[] chars = str.toCharArray();
    //     StringBuilder res = new StringBuilder();
    //     for (char aChar : chars) {
    //         res.append(Integer.toBinaryString(aChar)).append(" ");
    //     }
    //     System.out.println(res);
    // }
    public String addBinary(String a, String b) {
        // 视频详解
        // https://www.bilibili.com/video/BV1Mi4y1N7Qv?from=search&seid=14314649417478665196&spm_id_from=333.337.0.0
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        // 进位
        int carry = 0;
        while (i >= 0 || j >= 0) {
            // 这里是先进行字符相减,再进行i--,
            int digitA = i >= 0 ? a.charAt(i--) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j--) - '0' : 0;
            // 计算digitA + digitB + 进位是否
            int sum = digitA + digitB + carry;
            // sum + 2则需要再进一位
            carry = sum >= 2 ? 1 : 0;
            // sum如果>=2,证明carry已经进了以为,故,此时该位置上的数为sum - 2;
            sum = sum >= 2 ? sum - 2 : sum;
            result.append(sum);
        }
        // 防止最后一位还是进位,还能进1
        if (carry == 1) {
            result.append(1);
        }
        // 因为是从最后面开始加的,所以翻转后就是需要的结果
        return result.reverse().toString();
    }

}
