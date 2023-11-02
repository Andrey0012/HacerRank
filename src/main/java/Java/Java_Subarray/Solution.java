package Java.Java_Subarray;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] ints = new int[i];
        for (int j = 0; j < ints.length; j++) {
            ints [j] = scanner.nextInt();
        }
        int count =0;

        for (int j = 0; j < i; j++) {
            if (count<0 ) {count++;}
            for (int k = j; k < i; k++) {
                int[] ints2 = Arrays.copyOfRange(ints, j, k + 1);
                int sum = Arrays.stream(ints2).sum();
                if (sum<0) {count++;}
            }
        }
        System.out.println(count);

    }
}
