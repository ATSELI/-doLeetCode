package trueMeituan.the5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/3/19 11:45
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        l1.add(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l1.size(); j++) {
                l2.set(j, l1.get(j) + 1);
                l3.set(j, l1.get(j) + 2);
            }
            for (int l2i = l2.size() - 1 ; l2i >= 0; l2i --){
                l1.addFirst(l2.get(l2i));
            }
            for (int l3i = 0; l3i < l3.size(); l3i++){
                l1.addLast(l3.get(l3i));
            }
        }
        System.out.println(l1.get(k + 1));
    }
}
