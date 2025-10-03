package DataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class bitset {
    // Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            BitSet[] b = new BitSet[2];
            b[0]=new BitSet(n);
            b[1] = new BitSet(n);
            
            for(int i = 0;i<m;i++){
                String operation = sc.next();
                int op1 = sc.nextInt();
                int op2 = sc.nextInt();
                
                if("AND".equals(operation))
                b[op1-1].and(b[op2-1]);
                
                else if("OR".equals(operation))
                b[op1-1].or(b[op2-1]);
                
                else if("XOR".equals(operation))
                b[op1-1].xor(b[op2-1]);
                
                 else if("FLIP".equals(operation))
                b[op1-1].flip(op2);
                
                 else if("SET".equals(operation))
                b[op1-1].set(op2);
                
                else
                {
                    throw new IllegalArgumentException(String.format("Invalid operation: %s", operation));
                }
                System.out.println(b[0].cardinality()+" "+ b[1].cardinality());
            }
        }
    }
}
