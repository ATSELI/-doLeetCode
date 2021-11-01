package 剑指offer2.offer35_;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/18 11:41
 * 给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。
 * 示例 1：
 * 输入：timePoints = ["23:59","00:00"]
 * 输出：1
 * 示例 2：
 * 输入：timePoints = ["00:00","23:59","00:00"]
 * 输出：0
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/569nqc
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        String str = "00:00";
        String[] split = str.split(":");
        System.out.println(Integer.parseInt(split[1]));
    }
    public int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>();
        if (timePoints.size() > 1440){
            return 0;
        }
        for (String str: timePoints){
            String[] split = str.split(":");
            list.add(Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]));
        }
        Collections.sort(list);;
        list.add(list.get(0) + 24 * 60);
        int res = 24 * 60;
        // ++i是i+1后直接赋值给i,而i++则需要有一个空间储存i+1后的值,在将i+1的值复制后赋值给i,故原则上++1效率要比i++高
        for (int i = 1; i < list.size(); ++i){
            res = Math.min(res, list.get(i) - list.get(i - 1));
        }
        return res;
    }
}
