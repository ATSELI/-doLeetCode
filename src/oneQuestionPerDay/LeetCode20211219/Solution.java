package oneQuestionPerDay.LeetCode20211219;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/12/19 21:35
 * 在一个小镇里，按从 1 到 n 为 n 个人进行编号。传言称，这些人中有一个是小镇上的秘密法官。
 *
 * 如果小镇的法官真的存在，那么：
 *
 * 小镇的法官不相信任何人。
 * 每个人（除了小镇法官外）都信任小镇的法官。
 * 只有一个人同时满足条件 1 和条件 2 。
 * 给定数组trust，该数组由信任对 trust[i] = [a, b]组成，表示编号为 a 的人信任编号为 b 的人。
 *
 * 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的编号。否则，返回 -1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-town-judge
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];
        for (int[] edge : trust){
            int x = edge[0], y = edge[1];
            inDegrees[y]++;
            outDegrees[x]++;
        }
        for (int i = 1; i <= n; i++){
            if (inDegrees[i] == n - 1 && outDegrees[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
