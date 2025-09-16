package DataStructures;

import java.util.*;

// https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
public class Game_one_D {
    // you can move from index i to index i+1,i-1 , or i+leap as long as the
    // destination index is a cell containing a 0. If the destination index is
    // greater than n-1, you win the game.

    private static boolean helper(int leap, int[] game, int pos) {
        if (pos < 0 || game[pos] == 1)
            return false;
        if (pos >= game.length - 1 || pos + leap >= game.length)
            return true;
        game[pos] = 1;
        return helper(leap, game, pos + 1) || helper(leap, game, pos + leap) || helper(leap, game, pos - 1);
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return helper(leap, game, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
