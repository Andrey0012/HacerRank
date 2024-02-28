package Problem_Solving.Sherlock_and_Squares;

import java.io.*;
import java.util.stream.IntStream;

class Result {
    public static int squares(int a, int b) {
        //плохое время выполнения
//        int count = 0;
//        for (int i = a; i <= b; i++) {
//            double sqrt = Math.sqrt(i);
//            int sqrt1 = (int) sqrt;
//            if ((sqrt - sqrt1) == 0) count++;
//        }
//        return count;


        return (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int a = Integer.parseInt(firstMultipleInput[0]);

                int b = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.squares(a, b);

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

