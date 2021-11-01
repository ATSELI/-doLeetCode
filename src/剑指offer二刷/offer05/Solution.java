package 剑指offer二刷.offer05;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/17 12:15
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 */
public class Solution {
    // StringBuilder拼接
    // public String replaceSpace(String s) {
    //     StringBuilder builder = new StringBuilder();
    //     for (int i = 0; i < s.toCharArray().length; i++) {
    //         if (s.toCharArray()[i] == ' '){
    //             builder.append("%20");
    //         }else {
    //             builder.append(s.toCharArray()[i]);
    //         }
    //     }
    //     return builder.toString();
    // }

    // 扩容字符数组
    public String replaceSpace(String s) {
        int length = s.length(), index = 0;
        int[] array = new int[length * 3];
        for (int c : s.toCharArray()) {
            if (c == ' '){
                array[index++] = '%';
                array[index++] = '2';
                array[index++] = '0';
            }else {
                array[index++] = c;
            }
        }
        return new String(array, 0, index);
    }
}
