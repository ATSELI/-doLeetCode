package 剑指offer二刷.offer48_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/24 1:29
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 */
public class Solution {
    public static void main(String[] args) {
        String A = "abc";
        String B = new String("abc");
        System.out.println(A == B);
    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0, tmp = 0;
        for (int j = 0; j < s.length(); j++) {
            Integer i = map.getOrDefault(s.charAt(j), -1);
            map.put(s.charAt(j), j);
            tmp = j - i > tmp ? tmp + 1: j - i;
            res = Math.max(res, tmp);
        }
        return res;
    }
}
