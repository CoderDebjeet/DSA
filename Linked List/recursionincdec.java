package collections;
import java.io.*;
import java.util.*;

public class recursionincdec {

    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(pdi(n));
    }

    public static int pdi(int n) {
        if(n == 0) {
            return 0; // Base case: return 0 when n is 0
        }
        System.out.println(n); // Print the current value
        pdi(n - 1); // Recursive call
        System.out.println(n); // Print the current value again
        return n; // Return the current value
    }
}
