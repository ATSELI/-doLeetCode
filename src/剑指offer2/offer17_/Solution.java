package 剑指offer2.offer17_;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/10 9:10
 * 给定两个字符串 s 和t 。返回 s 中包含t的所有字符的最短子字符串。如果 s 中不存在符合条件的子字符串，则返回空字符串 "" 。
 * 如果 s 中存在多个符合条件的子字符串，返回任意一个。
 * 注意： 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 * 示例 1：
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * 解释：最短子字符串 "BANC" 包含了字符串 t 的所有字符 'A'、'B'、'C'
 * 示例 2：
 * 输入：s = "a", t = "a"
 * 输出："a"
 * 示例 3：
 * 输入：s = "a", t = "aa"
 * 输出：""
 * 解释：t 中两个字符 'a' 均应包含在 s 的子串中，因此没有符合条件的子字符串，返回空字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/M1oyTv
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public static void main(String[] args) {
    //     StringBuilder builder = new StringBuilder("abcdefg");
    //     StringBuilder res = builder;
    //     builder.deleteCharAt(builder.indexOf(String.valueOf('d')));
    //     System.out.println(res);
    // }
    public String minWindow(String s, String t) {
        return "";
    }
}
