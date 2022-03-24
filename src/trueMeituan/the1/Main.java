package trueMeituan.the1;

import java.util.Scanner;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/3/19 9:42
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] y = new int[n];
        int[] z = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            z[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] c = new int[m];
        int[] d = new int[n];
        for (int i = 0; i < m; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            d[i] = sc.nextInt();
        }
        StringBuilder builder = new StringBuilder();
        int zSum = 0;
        int mSum = 0;
        int sum = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            zSum += z[i];
            sum += y[i];
            mSum = sum;
            while (flag < m){
                if (sum >= c[flag]){
                    mSum = sum - d[flag];
                    flag++;
                }else {
                    break;
                }

            }
            if (zSum > mSum){
                builder.append("M");
            }else if (mSum > zSum){
                builder.append("Z");
            }else {
                builder.append("B");
            }
        }
        System.out.println(builder.toString());
    }
}
