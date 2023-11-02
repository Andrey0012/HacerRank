package Java.Java_Substring_Comparisons;

import java.util.Scanner;

public class sol {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for(int i=0;i<= (s.length()-k) ;i++){
            smallest = s.substring(i,i+k).compareTo(smallest)<0?s.substring(i,i+k):smallest;

            largest = s.substring(i,i+k).compareTo(largest)>0?s.substring(i,i+k):largest;

        }
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