package 剑指offer2.offer34;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/18 11:03
 * 某种外星语也使用英文小写字母，但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。
 * 给定一组用外星语书写的单词 words，以及其字母表的顺序 order，只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 false。
 * 示例 1：
 * 输入：words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * 输出：true
 * 解释：在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。
 * 示例 2：
 * 输入：words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * 输出：false
 * 解释：在该语言的字母表中，'d' 位于 'l' 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。
 * 示例 3：
 * 输入：words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * 输出：false
 * 解释：当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 'l' > '∅'，其中 '∅' 是空白字符，定义为比任何其他字符都小（更多信息）。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lwyVBB
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if (words.length < 2) {
            return false;
        }
        int[] sequence = new int[26];
        String cur = words[0];
        for (int i = 0; i < order.length(); i++) {
            sequence[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            String pre = words[i];
            for (int j = 0; j < cur.length(); j++) {
                if (j == pre.length()) {
                    return false;
                }
                if (sequence[cur.charAt(j) - 'a'] < sequence[pre.charAt(j) - 'a']){
                    break;
                }else if (sequence[cur.charAt(j) - 'a'] == sequence[pre.charAt(j) - 'a']){
                    continue;
                }else {
                    return false;
                }
            }
            cur = pre;
        }
        return true;
    }
}
