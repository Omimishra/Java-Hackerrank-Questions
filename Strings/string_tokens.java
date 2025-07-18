package Strings;
// We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
// Note: You may find the String.split method helpful in completing this challenge.
// https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
import java.util.Scanner;

public class string_tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
         String regex = "[ !,?._'@]+";
        String strTrim = s.trim(); 
        
        if(strTrim.isEmpty()) {// If the trimmed string is empty, there are no tokens
            // Print 0 and return
            System.out.println(0);
        } else {
            String[] strSplit = strTrim.split(regex);// Split the string using the regex
            // Print the number of tokens
        
            System.out.println(strSplit.length);
            for(int i = 0; i < strSplit.length; i++) {
                System.out.println(strSplit[i]);
            }
        } 
        scan.close();
    }
}
