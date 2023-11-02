package Java.Java_Hashset;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  t=Integer.parseInt(s.nextLine());
        System.out.println();
        HashSet<String> objects = new HashSet<>();
        for (int i = 0; i < t; i++) {
            objects.add( s.nextLine());
            System.out.println(objects.size());
        }
//Write your code here
    }
}