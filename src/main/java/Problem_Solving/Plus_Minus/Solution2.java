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

class Result2 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
//        float a=0;
//        float b=0;
//        float c=0;
//        DecimalFormatSymbols sp = new DecimalFormatSymbols();
//        sp.setDecimalSeparator('.');
//
//        DecimalFormat decimalFormat = new DecimalFormat("0.000000", sp);
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i)>0) {a=a+1;}
//            if (arr.get(i)<0) {b=b+1;}
//            if (arr.get(i)==0) {c=c+1;}
//        }
//        System.out.println(decimalFormat.format(a/arr.size()));
//        System.out.println(decimalFormat.format(b/arr.size()));
//        System.out.println(decimalFormat.format(c/arr.size()));
        BigDecimal pos = new BigDecimal("0");
        BigDecimal neg = new BigDecimal("0");
        BigDecimal zero = new BigDecimal("0");
        BigDecimal arrSize = new BigDecimal(String.valueOf(arr.size()));

        for (int item : arr) {
            if (item == 0) {
                zero = zero.add(BigDecimal.ONE);
            } else if (item == Math.abs(item)) {
                pos = pos.add(BigDecimal.ONE);
            } else {
                neg = neg.add(BigDecimal.ONE);
            }
        }
        System.out.println(pos.divide(arrSize, 6, RoundingMode.HALF_UP));
        System.out.println(neg.divide(arrSize, 6, RoundingMode.HALF_UP));
        System.out.println(zero.divide(arrSize, 6, RoundingMode.HALF_UP));

    }

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result2.plusMinus(arr);

        bufferedReader.close();
    }
}