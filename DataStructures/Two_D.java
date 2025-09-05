package DataStructures;
// https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
// a b c
//   d
// e f g
// In this problem you have to print the largest sum among all the hourglasses in the array.
import java.util.*;

public class Two_D {
    public static int maxHourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) { // we go from row 0 to 3
            for (int j = 0; j < 4; j++) { // the same with col we go 0 to 3
                int hourglassSum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j + 1] +
                        arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);

                maxSum = Math.max(maxSum, hourglassSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
        System.out.println(maxHourglassSum(arr));
    }
}
