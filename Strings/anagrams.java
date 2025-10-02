package Strings;
// Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. 
// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
import java.util.Arrays;
public class anagrams {
    static boolean isAnagram(String a,String b){
        if(a.length() != b.length()) {
            return false;
        }
        boolean check;
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);  
        check = Arrays.equals(arr1, arr2);
        return check;
    }
//     static boolean isAnagram(String a, String b) {
//     if (a.length() != b.length()) return false;
//     int[] count = new int[26];
//     a = a.toLowerCase();
//     b = b.toLowerCase();
//     for (int i = 0; i < a.length(); i++) {
//         count[a.charAt(i) - 'a']++;
//         count[b.charAt(i) - 'a']--;
//     }
//     for (int c : count) {
//         if (c != 0) return false;
//     }
//     return true;
// }
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        if(isAnagram(a, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
