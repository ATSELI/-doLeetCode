package oneQuestionPerDay.meituan.the9.the2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/3/18 23:44
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 小团是某综艺节目的策划，他为某个游戏环节设计了一种晋级规则，
         * 已知在这个游戏环节中每个人最后都会得到一个分数score_i，显而易见的是，游戏很有可能出现同分的情况，
         * 小团计划该环节晋级人数为x人，则将所有人的分数从高到低排序，所有分数大于等于第x个人的分数且得分不为0的人都可以晋级。
         * 请你求出本环节的实际晋级人数。显然这个数字可能是0，如果所有人的得分都是0，则没有人满足晋级条件。
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        int man = n - x;
        int ans = x;
        int flag = scores[man];
        if (flag == 0){
            for (int i = man; i < n; i++){
                if (scores[i] == 0){
                    ans --;
                }else {
                    break;
                }
            }
        }else {
            for (int i = man; i >=0 ;i--){
                if (scores[i] == flag){
                    ans ++;
                }else {
                    ans --;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
