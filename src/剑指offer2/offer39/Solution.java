package 剑指offer2.offer39;

import java.util.Stack;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/22 5:12
 * 请根据每日 气温 列表 temperatures，重新生成一个列表，要求其对应位置的输出为：
 * 要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用0 来代替。
 * 示例 1:
 * 输入: temperatures = [73,74,75,71,69,72,76,73]
 * 输出:[1,1,4,2,1,1,0,0]
 * 示例 2:
 * 输入: temperatures = [30,40,50,60]
 * 输出:[1,1,1,0]
 * 示例 3:
 * 输入: temperatures = [30,60,90]
 * 输出: [1,1,0]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/iIQa4I
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 单调栈
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        int p = 0;
        while (p < temperatures.length){
            if (stack.isEmpty() || temperatures[stack.peek()] >= temperatures[p]){
                stack.push(p++);
            }else {
                Integer pop = stack.pop();
                ans[pop] = p - pop;
            }
        }
        return ans;
    }
    // public int[] dailyTemperatures(int[] temperatures) {
    //     int[] ele = new int[temperatures.length];
    //     Stack<Integer> stack = new Stack<>();
    //     for (int tem: temperatures){
    //         stack.push(tem);
    //     }
    //     for (int i = stack.size() - 1; i >= 0; --i){
    //         int count = 0;
    //         for (int j = i; j < temperatures.length; ++j){
    //             if (temperatures[j] > temperatures[i]){
    //                 ele[i] = count;
    //                 break;
    //             }
    //             count ++;
    //         }
    //     }
    //     return ele;
    // }
}
