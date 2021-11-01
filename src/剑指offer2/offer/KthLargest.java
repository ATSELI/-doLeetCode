package 剑指offer2.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/28 11:33
 */
class KthLargest {
    private int k;
    private List<Integer> list;
    public KthLargest(int k, int[] nums) {
        list = new ArrayList<>();
        for (Integer num: nums){
            list.add(num);
        }
        Collections.sort(list);
    }

    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - val);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */



