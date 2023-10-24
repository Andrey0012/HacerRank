package Java.Java_Static_Initializer_Block;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    }
        static Scanner input = new Scanner(System.in);
        static int B = input.nextInt();
        static int H = input.nextInt();

        static Boolean exception = B > 0 && H > 0;

        static{
            if(!exception){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
        static {
            if (exception) {
                System.out.println(H*B);

            }
        }

}