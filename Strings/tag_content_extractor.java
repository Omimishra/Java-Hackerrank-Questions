package Strings;
// Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion
// https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
import java.util.*;
import java.util.regex.*;

public class tag_content_extractor {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher matcher = pattern.matcher(line);
        boolean found = false;
        while (matcher.find()){
            System.out.println(matcher.group(2));
            found = true;
        }
        if(!found){
            System.out.println("None");
        }
          	//Write your code here
			
			testCases--;
		}
	}
}





