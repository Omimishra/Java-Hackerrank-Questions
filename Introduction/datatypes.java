import java.util.Scanner;

public class datatypes {
    // Java has 8 primitive data types; char, boolean, byte, short, int, long,
    // float, and double. For this exercise, we'll work with the primitives used to
    // hold integer values (byte, short, int, and long):
    // Given an input integer, you must determine which primitive data types are
    // capable of properly storing that input.
    // https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && 32767 >= x) {
                    System.out.println("* short");
                }

                if (x >= Integer.MIN_VALUE && Integer.MAX_VALUE >= x) {
                    System.out.println("* int");
                }

                if (x >= Long.MIN_VALUE && Long.MAX_VALUE >= x) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}
