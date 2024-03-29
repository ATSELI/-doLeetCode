package 剑指offer二刷.offer30;

import java.util.Stack;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/15 23:51
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 *
 */
public class MinStack {
    Stack<Integer> stack1, stack2;
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
        Integer pop = stack1.pop();
        if (pop.equals(stack2.peek())){
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
