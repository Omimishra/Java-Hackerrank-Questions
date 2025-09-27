package DataStructures;

import java.util.*;

public class stack {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Character> paranthesis = new HashMap<>();
        paranthesis.put(')', '(');
        paranthesis.put('}', '{');
        paranthesis.put(']', '[');
        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code
            Boolean isbalanced = true;
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == '{' || c == '[' || c == '(')
                    st.add(c);
                else {
                    if (st.isEmpty() || st.pop() != paranthesis.get(c)) {
                        isbalanced = false;
                        break;
                    }
                }
            }
            if (!st.isEmpty())
                isbalanced = false;
            System.out.println(isbalanced);
        }
        sc.close();
    }
}
