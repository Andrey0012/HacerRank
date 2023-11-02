package Java.Java_String_Reverse;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String string = Solution.reverseString(A);
        if (A.equals(string)) {
            System.out.println("Yes");
        } else System.out.println("No");

    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

