package 剑指offer2.offer36;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.IntBinaryOperator;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/21 13:03
 * 根据 逆波兰表示法，求该后缀表达式的计算结果。
 * 有效的算符包括+、-、*、/。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * 说明：
 * 整数除法只保留整数部分。
 * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * 示例1：
 * 输入：tokens = ["2","1","+","3","*"]
 * 输出：9
 * 解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
 * 示例2：
 * 输入：tokens = ["4","13","5","/","+"]
 * 输出：6
 * 解释：该算式转化为常见的中缀算术表达式为：(4 + (13 / 5)) = 6
 * 示例3：
 * 输入：tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * 输出：22
 * 解释：
 * 该算式转化为常见的中缀算术表达式为：
 *   ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/8Zf90G
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str: tokens){
            switch (str){
                case "+":
                case "-":
                case "*":
                case "/":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(cale(a, b, str));
                    break;
                default:
                    stack.add(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
    public int cale(int a, int b, String str){
        switch (str){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                return a / b;
        }
    }
}
