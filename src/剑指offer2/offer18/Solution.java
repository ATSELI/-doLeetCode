package 剑指offer2.offer18;

import java.util.Locale;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/10 19:34
 * 给定一个字符串 s ，验证 s是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 本题中，将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: s = "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 * 示例 2:
 * 输入: s = "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/XltzEq
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome("\"0P\"");
        System.out.println(palindrome);
    }
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        s = s.toLowerCase();
        for (char c : s.toCharArray()){
            if ((c > 96 && c < 123) || (c > 47 && c < 58)){
                builder.append(c);
            }
        }

        System.out.println(builder);
        int start = 0, end = builder.length() - 1;
        while (end > start){
            if (builder.charAt(start) != builder.charAt(end)){
                return false;
            }
            end--;
            start ++;
        }
        return true;
    }
}
