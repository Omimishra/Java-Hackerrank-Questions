package DataStructures;
// https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
    // Given a list, L,N of Q integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            list.add(scanner.nextInt());
            
        int queries = scanner.nextInt();
        for(int i = 0; i < queries; i++) {
            String query = scanner.next();
            
            int index = scanner.nextInt();
            if (query.equals("Insert")){
                int newValue = scanner.nextInt();
                list.add(index, newValue); 
            }
            else
                list.remove(index);
        }
        
        scanner.close();
        
        for(Integer num : list)
            System.out.print(num + " ");
    }
}
