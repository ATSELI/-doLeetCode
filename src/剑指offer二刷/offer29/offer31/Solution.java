package 剑指offer二刷.offer29.offer31;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/8 17:19
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，
 * 但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public boolean validateStackSequences(int[] pushed, int[] popped) {
    //     LinkedList<Integer> list = new LinkedList<>();
    //     int input = 0, output = 0;
    //     while (input != pushed.length) {
    //         list.addLast(pushed[input++]);
    //         while (!list.isEmpty() && list.getLast() == popped[output]) {
    //             output++;
    //             list.removeLast();
    //         }
    //     }
    //     if (output != popped.length){
    //         return false;
    //     }
    //     return true;
    // }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int num : pushed) {
            stack.add(num);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
