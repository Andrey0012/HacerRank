package Java.Java_End_of_file;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c =1;
        while (scanner.hasNext()) {
            System.out.println(c++ + " " + scanner.nextLine());
        }
    }
}
