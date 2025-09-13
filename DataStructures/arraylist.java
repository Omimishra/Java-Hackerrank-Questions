package DataStructures;
import java.util.*;
public class arraylist {
    // You are given n lines. In each line there are zero or more integers. You need
    // to answer a few queries where you need to tell the number located in Yth
    // position of Xth line.
    // https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// n integer
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(sc.nextInt());
            }
            list.add(line);
        }
        int q = sc.nextInt();// for queries

        // to process each query
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x <= list.size() && y <= list.get(x - 1).size()) {
                System.out.println(list.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
