package Java.Java_List;

import java.io.*;
import java.util.*;
public class Sol {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();

        for (int j = 1; j < n+1; j++) {
            if (scan.hasNextInt()) {
                int n1 = scan.nextInt();
                L1.add(n1);
            }
        }
        int q = scan.nextInt();
        int i = 1;
        while (i<=q) {
            String S1 = scan.next();
            if (S1.equals("Insert")) {
                // System.out.println("This is inserted");
                int x = scan.nextInt();
                int y = scan.nextInt();
                L1.add(x, y);

            } else if (S1.equals("Delete")) {
                int x = scan.nextInt();
                // System.out.println("This is " + x);
                L1.remove(x);
            }
            i++;
        }
        String L3 = L1.toString().replace(",", "");
        String L4 = L3.replaceAll("\\[|\\]", "");
        System.out.println(L4);

    }
}