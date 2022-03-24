package oneQuestionPerDay.meituan.the9.the1;

import java.util.Scanner;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/3/18 22:59
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) { //保证a小b大
                a = a + b;
                b = a - b;
                a = a - b;
            }
            int max = 0, min = Integer.MAX_VALUE;
            for (int i = 0; i < n; ++i){
                int cookie = sc.nextInt();
                max = Math.max(cookie, max);
                min = Math.min(cookie, min);
            }
            // int rest=n-m;
            // int flag=0;
            // if(rest==0&&a==minNum&&b==maxNum) flag=1;
            // if(rest==1&&(a==minNum||b==maxNum)) flag=1;
            // if(rest>=2&&minNum>=a&&maxNum<=b) flag=1; //区间包含才行
            // if(flag==1) System.out.println("YES");
            // else System.out.println("NO");
            int len = n - m;
            int flag = 0;
            if (len == 0 && max == b && min == a) flag = 1;
            if (len == 1 && (max == b || min == a)) flag = 1;
            if (len >= 2 && max <= b && min >= a) flag = 1;
            if (flag == 1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
