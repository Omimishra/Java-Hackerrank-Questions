package DataStructures;

import java.lang.reflect.Method;
// https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true
class Printer
{
   //Write your code here
 static void printArray(Object[]arr){
    for(Object ob:arr){
        System.out.println(ob);
    }
 }
}
public class generics {
    // Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
    public static void main( String args[] ) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        Printer.printArray(intArray);
        Printer.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
