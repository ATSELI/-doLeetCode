package AllSort;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/3/24 1:57
 */
public class AllSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{1, 37, 5, 2, 4, 7, 8, 93, 3, 24, 6};
        for (int i : chaRuPaiXu(arrays)) {
            System.out.print(i + " ");
        }
    }

    /**
     * 冒泡排序
     *
     * @param arrays
     * @return
     */
    public static int[] maoPao(int[] arrays) {
        if (arrays == null) {
            return arrays;
        }
        for (int i = 0; i < arrays.length; ++i) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
        return arrays;
    }


    /**
     * 选择排序
     * @param arrays
     * @return
     */
    public static int[] xuanZePaiXu(int[] arrays) {
        if (arrays.length == 0){
            return arrays;
        }
        for (int i = 0; i < arrays.length; ++i){
            int minIndex = i;
            for (int j = i + 1; j < arrays.length; ++j){
                if (arrays[j] < arrays[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arrays[minIndex];
            arrays[minIndex] = arrays[i];
            arrays[i] = temp;
        }
        return arrays;
    }


    /**
     * 插入排序
     * @param arrays
     * @return
     */
    public static int[] chaRuPaiXu(int[] arrays) {
        if (arrays.length == 0){
            return arrays;
        }
        int current;
        for (int i = 0; i < arrays.length - 1; ++i){
            current = arrays[i + 1];
            int preIndex = i;
            while (preIndex >=0 && current < arrays[preIndex]){
                arrays[preIndex + 1] = arrays[preIndex];
                preIndex --;
            }
            arrays[preIndex + 1] = current;
        }
        return arrays;
    }



}
