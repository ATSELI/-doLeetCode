package oneQuestionPerDay.No458;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/25 8:37
 */
public class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int times = minutesToTest / minutesToDie;
        int base = times + 1;
        // base ^ ans >= buckets
        // ans >= log(buckets) / log(base)
        double temp = Math.log(buckets) / Math.log(base);
        return (int)Math.ceil(temp);
        // https://leetcode-cn.com/problems/poor-pigs/solution/hua-jie-suan-fa-458-ke-lian-de-xiao-zhu-by-guanpen/
    }
}
