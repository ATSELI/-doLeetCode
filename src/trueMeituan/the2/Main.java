package trueMeituan.the2;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/3/19 10:33
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        System.out.println(jjmi(s, t));
    }

    public static String jjmi(String s, int t) {
        StringBuilder builder = new StringBuilder();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> ans = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            list.add(aChar);
        }
        int length = list.size();
        if (t == 1) {
            for (int i = 0; i < length; ++i) {
                if (list.size() % 2 == 0) {
                    builder.append(list.get(list.size() / 2 - 1));
                    list.remove(list.size() / 2 - 1);
                } else {
                    builder.append(list.get(list.size() / 2));
                    list.remove(list.size() / 2);
                }
            }
        } else {
            int l = 0, r = 0;
            if (length % 2 == 1){
                ans.addFirst(list.get(0));
                l = 1;
                r = 2;
            }else {
                l = 0;
                r = 1;
            }
            while (r < length){
                ans.addFirst(list.get(l));
                ans.addLast(list.get(r));
                l += 2;
                r += 2;
            }
            for (int i = 0; i < ans.size(); i++) {
                builder.append(ans.get(i));
            }
            return builder.toString();
        }
        return builder.toString();
    }
}
