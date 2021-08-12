package 剑指offer.offer05;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/11 18:25
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.replaceSpace("We are happy.");
        System.out.println(s);
    }
    public String replaceSpace(String s) {
        // 我的解法,用到了Java自带的方法
        // String replace = s.replace(" ", "%20");
        // return replace;

        // 大佬解法
        StringBuilder builder = new StringBuilder();
        for (Character character: s.toCharArray()){
            if (character ==' '){
                builder.append("%20");
            }else {
                builder.append(character);
            }
        }
        return builder.toString();
    }
}
