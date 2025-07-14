package Strings;

import java.util.Scanner;

public class string_tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
         String regex = "[ !,?._'@]+";
        String strTrim = s.trim(); 
        
        if(strTrim.isEmpty()) {
            System.out.println(0);
        } else {
            String[] strSplit = strTrim.split(regex);
        
            System.out.println(strSplit.length);
            for(int i = 0; i < strSplit.length; i++) {
                System.out.println(strSplit[i]);
            }
        } 
        scan.close();
    }
}
