package Problem_Solving.Taum_and_Bday;

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
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long a=0;
        if (bc+z>=wc && wc+z>=bc) { a= ((long) b * bc + (long) w * wc);}
        if (bc+z<wc) {a = ((long) (bc + z) * w+ (long) b * bc);}
        if (wc+z<bc) { a=  ((long) (wc + z) * b+ (long) w * wc);}
        return a;

        //второй вариант
//        long blackGifts = (long) Math.min(bc, wc+z) * b;
//        long whiteGifts = (long) Math.min(wc, bc+z) * w;
//        return blackGifts + whiteGifts;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int b = Integer.parseInt(firstMultipleInput[0]);

                int w = Integer.parseInt(firstMultipleInput[1]);

                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int bc = Integer.parseInt(secondMultipleInput[0]);

                int wc = Integer.parseInt(secondMultipleInput[1]);

                int z = Integer.parseInt(secondMultipleInput[2]);

                long result = Result.taumBday(b, w, bc, wc, z);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
