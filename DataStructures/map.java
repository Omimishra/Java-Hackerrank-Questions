package DataStructures;
import java.util.*;
// https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
public class map {
    // You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.
    //Complete this code or write your own from scratch
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        Map<String,String> phn=new HashMap<>();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			String phone=in.nextLine();
            phn.put(name,phone);
		}
		while(in.hasNextLine())
		{
			String s=in.nextLine();
            if(phn.containsKey(s)){
                System.out.println(s+"="+phn.get(s));
            }
            else{
                System.out.println("Not found");
            }
            
		}
        in.close();
	}
}