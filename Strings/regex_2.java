package Strings;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// https://www.hackerrank.com/challenges/duplicate-word/problem?isFullScreen=true
public class regex_2 {
    // In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word.
    public static void main(String[] args) {

        String regex = "(?i)\\b([A-Za-z]+)\\b(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(regex, "$1");
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
