package Java_Static_Initializer_Block.Java_Strings_Introduction;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) >0)
            System.out.println("Yes");
        else System.out.println("No");
        char a = Character.toUpperCase(A.charAt(0));
        char b = Character.toUpperCase(B.charAt(0));
        System.out.println(a + A.substring(1)+" "+ b + B.substring(1));
    }
}

