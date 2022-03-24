package oneQuestionPerDay.LeetCode2022.Month1.Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/1/18 22:50
 */
public class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> times = new ArrayList<>();
        for (String timePoint : timePoints) {
            String[] time = timePoint.split(":");
            times.add(Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]));
        }
        Collections.sort(times);
        List<Integer> difference = new ArrayList<>();
        for (int i = 1; i <= times.size(); ++i) {
            difference.add(times.get(i) - times.get(i - 1));
        }
        difference.add(24 * 60 - (times.get(0) - times.get(times.size() - 1)));
        Collections.sort(difference);
        return difference.get(0);
    }
}
