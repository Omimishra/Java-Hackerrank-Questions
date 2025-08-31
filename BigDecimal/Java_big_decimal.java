package BigDecimal;

import java.math.BigDecimal;
import java.util.*;

public class Java_big_decimal {
// The first line consists of a single integer, n , denoting the number of integer strings.
//  You are only responsible for reordering the array's elements.
// https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        String tempS;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                BigDecimal bd1 = new BigDecimal(s[j]);
                BigDecimal bd2 = new BigDecimal(s[j + 1]);
                if (bd1.compareTo(bd2) < 0) {
                    tempS = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = tempS;
                }
            }
        }

        // Write your code here

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
