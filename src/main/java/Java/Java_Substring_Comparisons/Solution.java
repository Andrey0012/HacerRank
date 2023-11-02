package Java.Java_Substring_Comparisons;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.length()>=i+k) {
                String substring = s.substring(i, i + k);
                list.add(substring);
            }
        }
        //вариант решения со стримос и без
  //      List<String> sorted = list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
  //      smallest = sorted.get(0);
   //     largest = sorted.get(list.size()-1);
        Collections.sort(list);
        smallest = list.get(0);
        largest = list.get(list.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
