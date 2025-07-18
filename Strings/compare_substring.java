package Strings;
// Given a string,s , and an integer,k , complete the function so that it finds the lexicographically smallest and largest substrings of length k.
// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
import java.util.Scanner;

public class compare_substring {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String s = sc.next();
        int k = sc.nextInt();
        String result =getSmallestAndLargest(s, k);
        
        System.out.println(result);
        sc.close();
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest ;
        String largest ;
         if (s.length() < k) {
            return null;
        }
        String substrings[] = new String[s.length()-k+1];
        for(int i =0;i<=s.length()-k;i++){
            substrings[i]= s.substring(i, i+k);// Extracting all substrings of length k
        }
        smallest = substrings[0];
        largest = substrings[0];
        for(int j =0;j<substrings.length;j++){
            if(smallest.compareTo(substrings[j])>0){// Compare lexicographically
                // If the current substring is smaller than the smallest found so far, update smallest
                smallest = substrings[j];
            }
            if(largest.compareTo(substrings[j])<0){// Compare lexicographically
                // If the current substring is larger than the largest found so far, update largest
                largest = substrings[j];
            }
        }
        return smallest + "\n" + largest;
    }
}
