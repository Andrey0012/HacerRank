package Java.Java_Strings_Introduction;

import java.util.Locale;
import java.util.Scanner;

public class sol {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0) {
            System.out.println("Yes ");
        } else System.out.println("No");
        System.out.println(A.substring(0,1).toUpperCase(Locale.ROOT)+A.substring(1) + " " +
                B.substring(0,1).toUpperCase(Locale.ROOT)+B.substring(1));

    }
}
