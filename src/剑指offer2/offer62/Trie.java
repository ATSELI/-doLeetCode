package 剑指offer2.offer62;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/29 15:31
 * Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。
 * 这一数据结构有相当多的应用情景，例如自动补完和拼写检查。
 * 请你实现 Trie 类：
 * Trie() 初始化前缀树对象。
 * void insert(String word) 向前缀树中插入字符串 word 。
 * boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
 * boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false 。
 * 示例：
 * 输入
 * inputs = ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
 * inputs = [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
 * 输出
 * [null, null, true, false, true, null, true]
 * 解释
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // 返回 True
 * trie.search("app");     // 返回 False
 * trie.startsWith("app"); // 返回 True
 * trie.insert("app");
 * trie.search("app");     // 返回 True
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/QC3q1f
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */



public class Trie {
    // 用来标志该字母是否为某个单词的最后一个字母
    private boolean theEnd;
    private Map<Character, Trie> child = new HashMap<>();

    /** Initialize your data structure here. */
    public Trie(){
        theEnd = false;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie root = this;
        for (Character letter: word.toCharArray()){
            if (!root.child.containsKey(letter)){
                root.child.put(letter, new Trie());
            }
            root = root.child.get(letter);
        }
        root.theEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie root = this;
        for (Character letter: word.toCharArray()){
            if (!root.child.containsKey(letter)){
                return false;
            }
            root = root.child.get(letter);
        }
        return root.theEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie root = this;
        for (Character letter: prefix.toCharArray()){
            if (!root.child.containsKey(letter)){
                return false;
            }
            root = root.child.get(letter);
        }
        return true;
    }
}
