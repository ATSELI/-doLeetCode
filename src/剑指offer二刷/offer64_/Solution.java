package 剑指offer二刷.offer64_;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/2 9:39
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 *
 * https://leetcode-cn.com/problems/qiu-12n-lcof/
 */
public class Solution {
    public int sumNums(int n) {
        // 在&&中,如下,前面的n > 0如果已经判断为false,则不会继续往下执行
        // 同理,在||中,如果前面的式子判断为true,也不会执行下面的操作
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }


}
