package 剑指offer.offer30;

import java.util.List;
import java.util.Stack;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/7 15:55
 *     定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 *     调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *     MinStack minStack = new MinStack();
 *     minStack.push(-2);
 *     minStack.push(0);
 *     minStack.push(-3);
 *     minStack.min();   -->返回 -3.
 *     minStack.pop();
 *     minStack.top();      -->返回 0.
 *     minStack.min();   -->返回 -2.
 *
 *     来源：力扣（LeetCode）
 *     链接：https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof
 *     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinStack {
    // public static void main(String[] args) {
    //     MinStack stack = new MinStack();
    //     stack.push(2147483646);
    //     stack.push(2147483646);
    //     stack.push(2147483647);
    //     stack.top();
    //     stack.pop();
    //     stack.min();
    //     stack.pop();
    //     stack.min();
    //     stack.pop();
    //     stack.push(2147483647);
    //     stack.top();
    //     stack.min();
    //     stack.push(-2147483648);
    //     stack.top();
    //     stack.min();
    //     stack.pop();
    //     stack.min();
    // }

    /**
     * initialize your data structure here.
     *
     * ["MinStack","push","push","push","top","pop","min","pop","min","pop",
     * "push","top","min","push","top","min","pop","min"]
     *
     * [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],
     * [2147483647],[],[],[-2147483648],[],[],[],[]]
     *
     * 输出
     * [null,null,null,null,2147483647,null,2147483646,null,2147483646,null,
     * null,2147483647,2147483646,null,-2147483648,-2147483648,null,2147483646]
     *
     * 预计结果
     * [null,null,null,null,2147483647,null,2147483646,null,2147483646,null,
     * null,2147483647,2147483647,null,-2147483648,-2147483648,null,2147483647]
     */
    // 我的解法
    Stack<Integer> stack1, stack2;
    // Integer min;
    //
    // public MinStack() {
    //     stack1 = new Stack<>();
    //     stack2 = new Stack<>();
    // }
    //
    // public void push(int x) {
    //     stack1.push(x);
    //     System.out.println(stack2.isEmpty());
    //     if (stack2.isEmpty() || x <= min){
    //         stack2.push(x);
    //         min = x;
    //         System.out.println("push:" + min);
    //     }
    // }
    //
    // public void pop() {
    //     Integer pop = stack1.pop();
    //     System.out.println("stack1.pop():" + pop);
    //     if (pop.equals(min)){
    //         Integer pop1 = stack2.pop();
    //         System.out.println("stack2.pop():" + pop1);
    //         if (!stack2.isEmpty()){
    //             min = stack2.peek();
    //         }else {
    //             min = null;
    //         }
    //
    //     }
    // }
    //
    // public int top() {
    //     return stack1.peek();
    // }
    //
    // public int min() {
    //     return min;
    // }

    // 大佬的解法
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty() || stack2.peek() >= x){
            stack2.push(x);
        }
    }

    public void pop() {
        if (stack1.pop().equals(stack2.peek())){
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.min();
     */
}
