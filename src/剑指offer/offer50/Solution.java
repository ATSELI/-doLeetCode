package 剑指offer.offer50;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/17 14:38
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * s = "abaccdeff"
 * 返回 "b"
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char aaabbbcccdderf = solution.firstUniqChar("aaabbbcccdderf");
        System.out.println(aaabbbcccdderf);
    }

    public char firstUniqChar(String s) {
        // 超时了
        // Map<Character, Integer> map = new LinkedHashMap<>();
        // for (int i = 0; i < s.toCharArray().length; i++){
        //     if (!map.containsKey(s.toCharArray()[i])){
        //         map.put(s.toCharArray()[i], 1);
        //     }else{
        //         map.put(s.toCharArray()[i], map.get(s.toCharArray()[i]) + 1);
        //     }
        // }
        // for (Character c : map.keySet()){
        //     if (map.get(c) == 1){
        //         return c;
        //     }
        // }
        // return " ".toCharArray()[0];

        // Character[] character = new Character[256];
        // List<Character> list = new LinkedList<>();
        // for (int i = 0; i < s.toCharArray().length; i++) {
        //     if (character[s.toCharArray()[i]] == null){
        //         Character character1 = s.toCharArray()[i];
        //         if (list.contains(character1)){
        //             character[s.toCharArray()[i]] = character1;
        //             list.remove(character1);
        //         }else {
        //             list.add(s.toCharArray()[i]);
        //         }
        //     }
        // }
        // if (list.size() > 0){
        //     return list.get(0);
        // }else {
        //     return " ".toCharArray()[0];
        // }
        // }

        // 大佬解法
        Map<Character, Boolean> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, !map.containsKey(c));
        }
        for (char c : chars) {
            if (map.get(c)) {
                return c;
            }
        }
        return ' ';
    }
}
