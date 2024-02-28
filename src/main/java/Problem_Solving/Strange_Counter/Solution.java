package Problem_Solving.Strange_Counter;

import java.io.*;

class Result {

    public static long strangeCounter(long t) {
//        long time = 1;
//        long value = 3;
//        long valueMax = 3;
//        while (time < t) {
//            if (value == 1) {
//                valueMax = valueMax * 2;
//                value = valueMax + 1;
//            }
//            time++;
//            value--;
//        }
//        return value;

        long value = 3;
        while (t > value) {
            t -= value;
            value *= 2;
        }
        return value - t + 1;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        long t = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


