package Strings;
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
