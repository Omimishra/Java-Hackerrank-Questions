package Strings;

import java.util.Scanner;

public class compare_substring {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String s = sc.next();
        int k = sc.nextInt();
        String result =getSmallestAndLargest(s, k);
        
        System.out.println(result);
        sc.close();
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest ;
        String largest ;
         if (s.length() < k) {
            return null;
        }
        String substrings[] = new String[s.length()-k+1];
        for(int i =0;i<=s.length()-k;i++){
            substrings[i]= s.substring(i, i+k);
        }
        smallest = substrings[0];
        largest = substrings[0];
        for(int j =0;j<substrings.length;j++){
            if(smallest.compareTo(substrings[j])>0){
                smallest = substrings[j];
            }
            if(largest.compareTo(substrings[j])<0){
                largest = substrings[j];
            }
        }
        return smallest + "\n" + largest;
    }
}
