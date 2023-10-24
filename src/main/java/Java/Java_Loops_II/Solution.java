package Java.Java_Loops_II;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if (0<=t && t<=500){
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                System.out.println();
                if (a<=50 && a>=0 && b<=50 && b>=0 && n>=1 && n<=15) {
                    long p = a + b;
                    int j = 1;
                    do {
                        System.out.print(p + " ");
                        p = p + (long)Math.pow(2,j)*b;
                        j++;
                    }
                    while(j<=n);
                    System.out.println();
                }
            }
        }

        in.close();

    }
}