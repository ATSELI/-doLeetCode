package 剑指offer2.offer15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/9 22:16
 * 给定两个字符串s和p，找到s中所有 p 的变位词的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * 变位词 指字母相同，但排列不同的字符串。
 * 示例1:
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的变位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的变位词。
 * 示例 2:
 * 输入: s = "abab", p = "ab"
 * 输出: [0,1,2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的变位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的变位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的变位词。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/VabMRr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public List<Integer> findAnagrams(String s, String p) {
    //     if (p.length() > s.length()) {
    //         return new ArrayList<>();
    //     }
    //     List<Integer> list = new ArrayList<>();
    //     int[] res1 = new int[26];
    //     int[] res2 = new int[26];
    //     char[] aChars = s.toCharArray();
    //     char[] pChars = p.toCharArray();
    //     for (int i = 0; i < p.length(); i++) {
    //         res2[pChars[i] - 'a'] = res2[pChars[i] - 'a'] + 1;
    //         res1[aChars[i] - 'a'] = res1[aChars[i] - 'a'] + 1;
    //     }
    //     int left = 0, right = p.length();
    //     for (int i = right; i < s.length(); i++) {
    //         if (Arrays.equals(res1,res2)){
    //             list.add(left);
    //         }
    //         res1[aChars[left] - 'a'] = res1[aChars[left] - 'a'] - 1;
    //         res1[aChars[right] - 'a'] = res1[aChars[right] - 'a'] + 1;
    //         left++;
    //         right++;
    //     }
    //     if (Arrays.equals(res1, res2)) {
    //         list.add(left);
    //     }
    //     return list;
    // }

    // 大佬解法
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        List<Integer> list = new ArrayList<Integer>();
        if (p.length() > s.length()) {
            return list;
        }
        for (int i = 0; i < p.length(); i++) {
            arr1[p.charAt(i) - 'a']++;
            arr2[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(arr1, arr2)) {
            list.add(0);
        }
        for (int i = p.length(); i < s.length(); i++) {
            arr2[s.charAt(i - p.length()) - 'a']--;
            arr2[s.charAt(i) - 'a']++;
            if (Arrays.equals(arr1, arr2)) {
                list.add(i - p.length() + 1);
            }
        }
        return list;
    }

    // 作者：qingfengpython
    // 链接：https://leetcode-cn.com/problems/VabMRr/solution/shua-chuan-jian-zhi-offer-day09-zi-fu-ch-f3mv/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
