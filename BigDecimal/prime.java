package BigDecimal;

import java.io.*;
import java.math.*;

public class prime {
    // Given a large integer, n , use the Java BigInteger class' isProbablePrime
    // method to determine and print whether it's prime or not prime.
    // https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger big = new BigInteger(n);

        if (big.isProbablePrime(2)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
