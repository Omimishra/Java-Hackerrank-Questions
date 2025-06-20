import java.util.Scanner;

public class loops_II {
    // https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
    // We use the integers a, b, and n to create the following series:
    // (a+2^0*b), (a+2^0*b + 2^1*b), …, (a+2^0*b+2^1*b+…+2^n−1*b)
    // You are given q queries in the form of a, b, and n. For each query, print the
    // series corresponding to the given a, b, and n values as a single line of n
    // space-separated integers.

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int p = 1;
            int s = a + 1 * b;
            System.out.print(s + " ");

            int r = s;
            for (int j = 1; j < n; j++) {
                p = p * 2;
                r = r + p * b;
                System.out.print(r + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
