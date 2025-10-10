package DataStructures;
import java.util.*;
public class deque {
    // you are given N integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size M.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            dq.add(sc.nextInt());
            if(dq.size()==m){
                int size = new HashSet<>(dq).size();
                if(size > max)
                max = size;
                dq.removeFirst(); // Remove the oldest element to maintain the window size
            }
        }
        sc.close();
        System.out.println(max);
    }
}
