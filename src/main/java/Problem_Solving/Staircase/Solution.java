package Problem_Solving.Staircase;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        int spaces = n - 1, symbols = 1;

        if (0 < n && n <= 100) {
            for (int i = 0; i < n; i++) {
                //            System.out.println(" ".repeat(spaces) + "#".repeat(symbols));
                System.out.println(String.join("", Collections.nCopies(spaces, " "))
                        + String.join("", Collections.nCopies(symbols, "#")));
                spaces -= 1;
                symbols += 1;
            }
        }
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            Result.staircase(n);
        }catch (NumberFormatException e){}

        bufferedReader.close();
    }
}
