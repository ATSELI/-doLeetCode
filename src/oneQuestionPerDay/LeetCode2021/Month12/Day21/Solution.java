package oneQuestionPerDay.LeetCode2021.Month12.Day21;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/12/21 8:45
 * 给你一个字符串date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。请你计算并返回该日期是当年的第几天。
 *
 * 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/day-of-the-year
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int dayOfYear(String date) {
        int ans = 0;
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 12; i++){
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                map.put(i, 31);
            }else if (i == 2){
                map.put(i, 28);
            }else {
                map.put(i, 30);
            }
        }
        if (year % 400 == 0 || year % 4 == 0){
            map.put(2, 29);
        }
        int month = Integer.parseInt(split[1]);
        for (int i = 1; i < month; ++i){
            ans += map.get(i);
        }
        ans += Integer.parseInt(split[2]);
        return ans;
    }
}
