package Strings;

import java.util.Scanner;

public class intro {
    // For the first line, sum the lengths of A and B.
// For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
// For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

// https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
 public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // Read two strings from input
        String A=sc.next();
        String B=sc.next();
        sc.close();
        // find the length of both strings and print the sum
        int al = A.length();
        int bl = B.length();
        System.out.println(al+bl);
        // Compare the two strings lexicographically
      int result= A.compareTo(B);
        if(result>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        // Capitalize the first letter of both strings and print them
       String f =A.substring(0,1).toUpperCase()+A.substring(1);
       String l =B.substring(0,1).toUpperCase()+B.substring(1);
       System.out.println(f+" "+l);
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
