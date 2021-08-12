package 剑指offer.offer09;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/5 20:51
 * <p>
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * <p>
 * 示例1
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * <p>
 * 示例2
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 * <p>
 * 提示:
 * 1 <= values <= 10000
 * 最多会对 appendTail、deleteHead 进行 10000 次调用
 */
public class CQueue {

    // 我的
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack = new Stack<>();
    // public CQueue() {
    //
    // }
    //
    // public void appendTail(int value) {
    //     while (!stack.isEmpty()){
    //         stack1.push(stack.pop());
    //     }
    //     stack1.push(value);
    //     while (!stack1.isEmpty()){
    //         stack.push(stack1.pop());
    //     }
    // }
    //
    // public int deleteHead() {
    //     if (stack.isEmpty()){
    //         return -1;
    //     }
    //     return stack.pop();
    // }


    // 改进1
    // 42 ms,46.3 MB
    // public CQueue() {
    //
    // }
    //
    // public void appendTail(int value) {
    //     stack.push(value);
    // }
    //
    // public int deleteHead() {
    //     if (!stack1.isEmpty()){
    //         return stack1.pop();
    //     }
    //     if (stack.isEmpty()){
    //         return -1;
    //     }
    //     while (!stack.isEmpty()){
    //         stack1.push(stack.pop());
    //     }
    //     return stack1.pop();
    // }
    /**
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */

    //优质答案
    // 39 ms,47.4 MB
    LinkedList<Integer> A, B;
    public CQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }
    public void appendTail(int value) {
        A.addLast(value);
    }
    public int deleteHead() {
        if(!B.isEmpty()) {
            return B.removeLast();
        }
        if(A.isEmpty()) {
            return -1;
        }
        while(!A.isEmpty()) {
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }

    // 作者：jyd
    // 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/solution/mian-shi-ti-09-yong-liang-ge-zhan-shi-xian-dui-l-2/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
