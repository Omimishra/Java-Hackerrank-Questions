package Strings;

import java.util.Scanner;

public class palindrome {
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
