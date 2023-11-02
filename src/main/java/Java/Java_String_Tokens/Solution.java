package Java.Java_String_Tokens;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.
//            String [] results= s.split("[^a-zA-Z]+");
//
//            System.out.println(results.length);
//
//            for (int i = 0; i < results.length; i++) {
//                System.out.println(results[i]);
//            }
        if (s.isEmpty()) {
            System.out.println(1);
        } else {
            String[] arrString = s.trim().split("[! ,?._'@]+");
            System.out.println(arrString.length);
            for (String str : arrString) {
                System.out.println(str);
            }
        }
            scan.close();

    }
}
