import java.util.Scanner;
public class output_formatting {
    //https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=scan.next();
                int x=scan.nextInt();
                int a = s1.length();
               System.out.print(s1);
               for (int j= 0 ; j<15-a; j++)
               System.out.print(" ");
                int d = String.valueOf(x).length();
                if (d==3)
                {
                  System.out.println(x);  
                }
                if(d==2)
                {
                     System.out.println("0"+x);  
                }
                if(d==1)
                {
                     System.out.println("00"+x);  
                }
                
                //Complete this line
            } scan.close();
            System.out.println("================================");

    }
}
