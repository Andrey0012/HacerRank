package Java.Java_Anagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram (String a, String b) {
        // Complete the function
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            String c = String.valueOf(a.charAt(i));
            listA.add(c.toUpperCase());
        }
        for (int i = 0; i < b.length(); i++) {
            String c = String.valueOf(b.charAt(i));
            listB.add(c.toUpperCase());
        }
        Collections.sort(listA);
        Collections.sort(listB);
        if (listA.equals(listB)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
