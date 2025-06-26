import java.util.*;
// Complete the code to convert an integer to a string and check if the conversion is correct.
// If the conversion is correct, print "Good job", otherwise print "Wrong answer."
//https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true

 public class int_to_string {
 public static void main(String[] args) {

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below
String s = Integer.toString(n);

   //Write your code here

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }
}
