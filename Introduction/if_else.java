import java.util.Scanner;
class if_else {
    //https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N%2==1)
        System.out.println("Weird");
        if(N%2==0)
        {
         if(2<=N&& N<=5)
       System.out.println("Not Weird"); 
         else if(6<=N&& N<=20)
       System.out.println("Weird");
        else if( N>20)
        System.out.println("Not Weird");
        }
        
    }
}
