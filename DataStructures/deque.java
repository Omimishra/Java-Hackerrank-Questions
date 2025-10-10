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
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            dq.add(num);
            set.add(num);
            if(dq.size()==m){
                max=Math.max(max, set.size());
                int removed = dq.remove();
                if(!dq.contains(removed)){
                    set.remove(removed);
                }
            }
        }
        sc.close();
        System.out.println(max);
    }
}
