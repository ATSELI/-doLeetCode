package 剑指offer2.offer64;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/29 19:41
 * 设计一个使用单词列表进行初始化的数据结构，单词列表中的单词 互不相同 。 如果给出一个单词，请判定能否只将这个单词中一个字母换成另一个字母，使得所形成的新单词存在于已构建的神奇字典中。
 * <p>
 * 实现 MagicDictionary 类：
 * <p>
 * MagicDictionary() 初始化对象
 * void buildDict(String[]dictionary) 使用字符串数组dictionary
 * 设定该数据结构，dictionary 中的字符串互不相同
 * bool search(String searchWord) 给定一个字符串 searchWord ，
 * 判定能否只将字符串中 一个 字母换成另一个字母，使得所形成的新字符串能够与字典中的任一字符串匹配。如果可以，返回 true ；否则，返回 false 。
 * 示例：
 * <p>
 * 输入
 * inputs = ["MagicDictionary", "buildDict", "search", "search", "search", "search"]
 * inputs = [[], [["hello", "leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]
 * 输出
 * [null, null, false, true, false, false]
 * 解释
 * MagicDictionary magicDictionary = new MagicDictionary();
 * magicDictionary.buildDict(["hello", "leetcode"]);
 * magicDictionary.search("hello"); // 返回 False
 * magicDictionary.search("hhllo"); // 将第二个 'h' 替换为 'e' 可以匹配 "hello" ，所以返回 True
 * magicDictionary.search("hell"); // 返回 False
 * magicDictionary.search("leetcoded"); // 返回 False
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/US1pGT
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MagicDictionary {

    // 广义邻居法,例如一个单词apple,那么我们用一个占位符*代替可能出现的所有情况,*pple,a*ple....
    Map<String, Integer> map = new HashMap<>();

    /**
     * Initialize your data structure here.
     */
    public MagicDictionary() {
    }

    public void buildDict(String[] dictionary) {
        for (String dic : dictionary) {
            char[] chars = dic.toCharArray();
            for (int i = 0; i < chars.length; ++i) {
                char tmp = chars[i];
                chars[i] = '*';
                String s = String.copyValueOf(chars);
                map.put(s, map.getOrDefault(s, 0) + 1);
                chars[i] = tmp;
            }
            map.put(dic, 1);
        }
    }

    public boolean search(String searchWord) {
        // if (map.containsKey(searchWord)){
        //     return false;
        // }
        char[] chars = searchWord.toCharArray();
        for (int i = 0; i < chars.length; ++i){
            char tmp = chars[i];
            chars[i] = '*';
            String s = String.copyValueOf(chars);
            // ["MagicDictionary", "buildDict", "search", "search", "search", "search"]
            // [[], [["hello","hallo","leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]
            // 输出: [null,null,false,true,false,false]
            // 预期结果: [null,null,true,true,false,false]
            if (map.containsKey(s) && (!map.containsKey(searchWord) || map.getOrDefault(s, 0) > 1)) {
                return true;
            }
            chars[i] = tmp;
        }
        return false;
    }

    // 作者：vanilla111
    // 链接：https://leetcode-cn.com/problems/US1pGT/solution/java-bao-li-jie-fa-yan-yi-lin-ju-by-vani-uih1/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
