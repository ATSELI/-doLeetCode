package oneQuestionPerDay.LeetCode20211206;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/12/6 1:19
 */
public class Solution {
    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        if (k > s1.length){
            return s;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < k; i++){
            builder.append(s1[i]).append(" ");
        }
        return builder.toString().trim();
    }
}
