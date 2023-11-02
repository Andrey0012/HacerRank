package Java.Java_List;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            nList.add(l);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String request = scanner.next();
            if (request.equals("Insert")) {
                int number = scanner.nextInt();
                int insert = scanner.nextInt();
                nList.add(number, insert);
            } else if (request.equals("Delete")) {
                int delete = scanner.nextInt();
                nList.remove(delete);
            }
        }
        String L3 = nList.toString().replace(",", "");
        String L4 = L3.replaceAll("\\[|\\]", "");
        System.out.println(L4);
    }
}
