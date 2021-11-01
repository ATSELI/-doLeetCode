package 剑指offer2.offer63;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/29 17:14
 * 在英语中，有一个叫做词根(root) 的概念，
 * 它可以跟着其他一些词组成另一个较长的单词——我们称这个词为继承词(successor)。
 * 例如，词根an，跟随着单词other(其他)，可以形成新的单词another(另一个)。
 *
 * 现在，给定一个由许多词根组成的词典和一个句子，需要将句子中的所有继承词用词根替换掉。如果继承词有许多可以形成它的词根，则用最短的词根替换它。
 * 需要输出替换之后的句子。
 *
 * 示例 1：
 * 输入：dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
 * 输出："the cat was rat by the bat"
 * 示例 2：
 * 输入：dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
 * 输出："a a b c"
 * 示例 3：
 * 输入：dictionary = ["a", "aa", "aaa", "aaaa"], sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"
 * 输出："a a a a a a a a bbb baba a"
 * 示例 4：
 * 输入：dictionary = ["catt","cat","bat","rat"], sentence = "the cattle was rattled by the battery"
 * 输出："the cat was rat by the bat"
 * 示例 5：
 * 输入：dictionary = ["ac","ab"], sentence = "it is abnormal that this solution is accepted"
 * 输出："it is ab that this solution is ac"
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/UhWRSj
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        PrefixTree prefixTree = new PrefixTree();
        // 将词根存入到前缀树中
        for (String dic: dictionary){
            PrefixTree root = prefixTree;
            for (Character letter: dic.toCharArray()){
                if (!root.child.containsKey(letter)){
                    root.child.put(letter, new PrefixTree());
                }
                root = root.child.get(letter);
            }
            root.theEnd = true;
            // System.out.println(root.theEnd);
        }
        // 将sentence分割成每个单词，方便后续的替换
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; ++i){
            PrefixTree root = prefixTree;
            // 用一个StingBuilder对象记录最短的词根
            StringBuilder builder = new StringBuilder();
            for (Character letter: strings[i].toCharArray()){
                if (!root.child.containsKey(letter)){
                    break;
                }
                // 将每个字母加入到builder中
                builder.append(letter);
                // 得先跳到下一个才能进行判断下一个字母是不是最后一个
                root = root.child.get(letter);
                if (root.theEnd){
                    strings[i] = builder.toString();
                    break;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String str: strings){
            builder.append(str).append(" ");
        }
        return builder.toString().trim();
    }

    class PrefixTree{
        private Map<Character, PrefixTree> child;
        private boolean theEnd;
        public PrefixTree(){
            child = new HashMap<>();
            theEnd = false;
        }
    }
}
