package Strings;
import java.util.Scanner;
public class regex {
// A valid IP address is an IP in the form of x.x.x.x where x is    a number between 0 and 255.
// Given a string , print "true" if it is a valid IP address, print "false" otherwise.
// https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
    // You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(MyRegex.pattern));
        }

        in.close();
    }
}
//Write your code hereclass Solution{

class MyRegex{
    static final String pattern = 
        "((([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5])).){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))";
}
