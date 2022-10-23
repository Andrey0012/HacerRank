package Problem_Solving.Plus_Minus;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(int n, List<Integer> arr) {
        // Write your code here
        float pos = 0, neg = 0, zero = 0;

        DecimalFormatSymbols sp = new DecimalFormatSymbols();
        sp.setDecimalSeparator('.');

        DecimalFormat df = new DecimalFormat("0.000000", sp);


        if (0 < n && n <= 100) {

            for (int i = 0; i < n; i++) {
                if (-100 <= arr.get(i) && arr.get(i) <= 100) {
                    pos += (arr.get(i) > 0) ? 1 : 0;
                    neg += (arr.get(i) < 0) ? 1 : 0;
                    zero += (arr.get(i) == 0) ? 1 : 0;
                }
            }
        }
        float ratioPos = pos / n;
        float ratioNeg = neg / n;
        float ratioZero = zero / n;
        System.out.println(df.format(ratioPos));
        System.out.println(df.format(ratioNeg));
        System.out.println(df.format(ratioZero));
    }


}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(n, arr);

        bufferedReader.close();
    }
}
