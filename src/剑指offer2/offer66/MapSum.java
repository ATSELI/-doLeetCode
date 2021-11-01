package 剑指offer2.offer66;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/30 8:54
 * 实现一个 MapSum 类，支持两个方法，insert和sum：
 * MapSum() 初始化 MapSum 对象
 * void insert(String key, int val) 插入 key-val 键值对，字符串表示键 key ，整数表示值 val 。如果键 key 已经存在，那么原来的键值对将被替代成新的键值对。
 * int sum(string prefix) 返回所有以该前缀 prefix 开头的键 key 的值的总和。
 * 示例：
 * 输入：
 * inputs = ["MapSum", "insert", "sum", "insert", "sum"]
 * inputs = [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
 * 输出：
 * [null, null, 3, null, 5]
 * 解释：
 * MapSum mapSum = new MapSum();
 * mapSum.insert("apple", 3);
 * mapSum.sum("ap");           // return 3 (apple = 3)
 * mapSum.insert("app", 2);
 * mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/z1R5dt
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MapSum {
    Map<String, Integer> keyValue;
    /** Initialize your data structure here. */
    public MapSum() {
        keyValue = new HashMap<>();
    }

    public void insert(String key, int val) {
        keyValue.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (String key : keyValue.keySet()){
            if (key.length() >= prefix.length()){
                if (prefix.equals(key.substring(0, prefix.length()))){
                    sum += keyValue.get(key);
                }
            }
        }
        return sum;
    }
}
