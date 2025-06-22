import java.util.Scanner;
// Complete the given code so that it outputs the area of a parallelogram with breadth B and height H.
public class static_initializer_block {
  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner (System.in);
        int b= sc.nextInt();
        int h = sc.nextInt();
        if (b> 0 && h > 0)
            System.out.println(b*h);
    else 
    System.out.println("java.lang.Exception: Breadth and height must be positive");
        
    sc.close();
    }  
}