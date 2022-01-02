package oneQuestionPerDay.LeetCode20211220;

import java.util.Arrays;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/12/20 14:38
 * 冬季已经来临。你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
 * <p>
 * 在加热器的加热半径范围内的每个房屋都可以获得供暖。
 * <p>
 * 现在，给出位于一条水平线上的房屋houses 和供暖器heaters 的位置，请你找出并返回可以覆盖所有房屋的最小加热半径。
 * <p>
 * 说明：所有供暖器都遵循你的半径标准，加热的半径也一样。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/heaters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int ans = 0;
        Arrays.sort(heaters);
        for (int house : houses) {
            int i = binarySearch(house, heaters);
            int j = i + 1;
            int leftNum = i < 0 ? Integer.MAX_VALUE : house - heaters[i];
            int rightNum = j >= heaters.length ? Integer.MAX_VALUE : heaters[j] - house;
            int tempNum = Math.min(leftNum, rightNum);
            ans = Math.max(ans, tempNum);
        }
        return ans;
    }

    public int binarySearch(int house, int[] heaters) {
        int left = 0, right = heaters.length - 1;
        if (heaters[0] > house) {
            return -1;
        }
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if (heaters[mid] > house) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }
}
