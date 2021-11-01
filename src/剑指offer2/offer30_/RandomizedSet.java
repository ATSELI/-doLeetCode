package 剑指offer2.offer30_;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/16 22:35
 */
public class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random random;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)){
            return false;
        }
        // 找到该数的下标
        Integer index = map.get(val);
        // 找到最后一个数
        Integer lastNum = list.get(list.size() - 1);
        // 把最后一个数存入该位置,类似于删除;
        list.set(index, lastNum);
        // 更改最后一个数的在map中的下标
        map.put(lastNum, index);
        // 将这个数在map中删除
        map.remove(val);
        // 把最后一个数删除
        list.remove(list.size() - 1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
