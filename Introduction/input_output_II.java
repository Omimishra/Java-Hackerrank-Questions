import java.util.Scanner;

public class input_output_II {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declare variables here
        // Read and save an integer, double, and String to your variables.
        System.out.println("Enter an integer, a double, and a string:");
       int i = scan.nextInt();
            double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();
            scan.close();
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);

        
        }
       
    }

