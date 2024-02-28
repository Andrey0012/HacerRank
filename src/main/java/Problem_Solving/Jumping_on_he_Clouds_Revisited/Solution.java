package Problem_Solving.Jumping_on_he_Clouds_Revisited;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

//    static int jumpingOnClouds(int[] c, int k) {
//        int e =100;
//        if (c[0]==1) e=98;
//        for (int i = k; i < c.length; i++) {
//            int i1 = c[i];
//            if (i1==0) e--;
//            else e-=3;
//            i=i+k-1;
//        }
//        return  e-1;
//    }
static int jumpingOnClouds(int[] c, int k) {
    int e=100;
    int index=0;
    while(true){
        if(c[(index+k)%c.length]==0){
            if(index==0 && e<100){
                break;
            }
            e--;
            index=(index+k)%c.length;
        }else{
            if(index==0 && e<100){
                break;
            }
            e=e-3;
            index=(index+k)%c.length;
        }

    }
    return e;

}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

