package Strings;
// In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
// Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.
// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
import java.util.Scanner;
import java.util.regex.Pattern;

public class syntax_checker {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
    int cnt = in.nextInt();
    in.nextLine();
    for (int i = 0; i < cnt; i++){
        try{ // Attempt to compile the regex pattern
            // If the pattern is invalid, it will throw a PatternSyntaxException
            Pattern.compile(in.nextLine());
        } catch (Exception e){ // If an exception is caught, it means the pattern is invalid
            // Print "Invalid" if the pattern cannot be compiled
            System.out.println("Invalid");
            continue; // Skip to the next iteration
        }
        System.out.println("Valid");// If no exception is thrown, the pattern is valid
    }
    in.close();
		}
}
