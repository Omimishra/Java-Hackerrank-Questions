package Strings;
// According to the policy, a username is considered valid if all the following constraints are satisfied:

// The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
// The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
// The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or [A-Z] uppercase character .

import java.util.Scanner;
class UsernameValidator {
    /*
    * Write regular expression here.
    */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class valid_username {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

