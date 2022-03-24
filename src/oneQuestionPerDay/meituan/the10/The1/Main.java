package oneQuestionPerDay.meituan.the10.The1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/3/15 11:55
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 某比赛已经进入了淘汰赛阶段,已知共有n名选手参与了此阶段比赛，他们的得分分别是a_1,a_2….a_n,小美作为比赛的裁判希望设定一个分数线m，
         * 使得所有分数大于m的选手晋级，其他人淘汰。
         *
         * 但是为了保护粉丝脆弱的心脏，小美希望晋级和淘汰的人数均在[x,y]之间。
         *
         * 显然这个m有可能是不存在的，也有可能存在多个m，如果不存在，请你输出-1，如果存在多个，请你输出符合条件的最低的分数线。
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        if (y + y < n || x + x > n){
            System.out.println("-1");
        }
        if (x + y > n){
            System.out.println(nums[x - 1]);
        }else {
            System.out.println(nums[n - y - 1]);
        }
    }

}
