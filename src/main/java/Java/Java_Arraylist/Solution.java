package Java.Java_Arraylist;

//import java.util.ArrayList;
//import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> listN = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> listD = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                int dNumber = scanner.nextInt();
                listD.add(dNumber);
            }
            listN.add(listD);
        }
        int q = scanner.nextInt();
        int i =0;
        while (i< q){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(listN.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
            i++;
        }
    }
}