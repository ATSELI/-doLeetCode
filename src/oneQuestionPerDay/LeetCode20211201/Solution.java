package oneQuestionPerDay.LeetCode20211201;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/12/1 15:36
 * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
 *
 * 请你返回字符串的能量。
 * https://leetcode-cn.com/problems/consecutive-characters/
 */
public class Solution {
    public int maxPower(String s) {
        if (s.length() == 0){
            return 0;
        }
        int power = 1, res = 1;
        char sign = s.charAt(0);
        for (int i = 1; i < s.length(); ++i){
            if (s.charAt(i) == sign){
                ++ power;
            }else {
                sign = s.charAt(i);
                power = 1;
            }
            res = Math.max(res, power);
        }
        return res;
    }
}
