package Java.Java_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sol {
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<List<String>> listN = new ArrayList<>();
        for (int i = 0; i < n; i++) {
 //           Integer quantity = scanner.nextInt();
            String list = scanner.nextLine();
            String[] split = list.split(" ");
            ArrayList<String> stringList = new ArrayList<>(Arrays.asList(split));
            listN.add(stringList);
        }
        System.out.println(listN);
        int q = scanner.nextInt();
        System.out.println();
        int i =0;
        while (i< q){
            int qNumber = scanner.nextInt();
            int qNumberTwo = scanner.nextInt();
            try {
                String integer = listN.get(qNumber-1).get(qNumberTwo-1);
                System.out.println(integer);
            } catch (Exception e) {
                System.out.print("ERROR!");
            }
            i++;
        }
    }
}
