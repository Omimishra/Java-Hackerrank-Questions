package BigDecimal;
import java.util.*;
import java.math.*;
// In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
public class big_integer {
    // https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
         BigInteger bigInteger1 = new BigInteger(a);
        BigInteger bigInteger2 = new BigInteger(b);
        BigInteger sum =  bigInteger1.add(bigInteger2);
        BigInteger product =  bigInteger1.multiply(bigInteger2);
        System.out.println(sum);
        System.out.println(product);
        sc.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
