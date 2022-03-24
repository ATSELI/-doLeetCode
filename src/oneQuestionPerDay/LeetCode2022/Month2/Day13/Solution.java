package oneQuestionPerDay.LeetCode2022.Month2.Day13;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/2/13 1:15
 */
public class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] nums = new int[5];
        int ans = Integer.MAX_VALUE;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] == 'b') {
                nums[0]++;
            } else if (chars[i] == 'a') {
                nums[1]++;
            } else if (chars[i] == 'l') {
                nums[2]++;
            } else if (chars[i] == 'o') {
                nums[3]++;
            } else if (chars[i] == 'n') {
                nums[4]++;
            }
        }
        nums[2] /= 2;
        nums[3] /= 2;
        for (int i = 0; i < 5; ++i) {
            ans = Math.min(ans, nums[i]);
        }
        return ans;
    }
}
