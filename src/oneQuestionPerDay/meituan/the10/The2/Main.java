package oneQuestionPerDay.meituan.the10.The2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/3/15 12:57
 */
public class Main {
    /**
     * 我们称一个长度为n的序列为正则序列，当且仅当该序列是一个由1~n组成的排列，
     * 即该序列由n个正整数组成，取值在[1,n]范围，且不存在重复的数，同时正则序列不要求排序
     * 有一天小团得到了一个长度为n的任意序列s，他需要在有限次操作内，
     * 将这个序列变成一个正则序列，每次操作他可以任选序列中的一个数字，并将该数字加一或者减一。
     * <p>
     * 请问他最少用多少次操作可以把这个序列变成正则序列？
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; ++i){
            sum += Math.abs(nums[i] - i - 1);
        }
        System.out.println(sum);
    }
}
