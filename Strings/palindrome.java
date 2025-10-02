package Strings;
// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
// Given a string , print Yes if it is a palindrome, print No otherwise.
// https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int l= A.length();
        char ch;
        String rev ="";
        for (int i =0 ; i<l;i++)
        {
            ch=A.charAt(i);
            rev= ch+rev;
        
        }
        if (rev.equals(A))
        System.out.println("Yes");
    else
        System.out.println("No");
        
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
    }
    
}
