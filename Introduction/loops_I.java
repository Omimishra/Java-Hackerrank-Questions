import java.util.*;
//https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
public class loops_I {
    //Given an integer,N , print its first 10 multiples. Each multiple N*i should be printed on a new line in the form: N x i = result.
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
         for (int i =1 ; i<=10; i++)
        { //
            System.out.println(a+" x " + i + " = "+a*i);
        }
        scan.close();
    }
    }
