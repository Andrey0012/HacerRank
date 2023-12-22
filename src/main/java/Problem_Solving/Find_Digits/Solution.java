package Problem_Solving.Find_Digits;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {

    public static int findDigits(int n) {
        AtomicInteger count = new AtomicInteger();
        String number = String.valueOf(n);
        String[] digits2 = number.split("(?<=.)");
        List<Integer> collect = Arrays.stream(digits2).map(Integer::valueOf).collect(Collectors.toList());
        collect.forEach(element -> {
            if (element!=0){
                if (n%element==0) {
                    count.getAndIncrement();
                }
            }
        });
        return count.get();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.findDigits(n);

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
