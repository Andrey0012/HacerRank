package Problem_Solving.Beautiful_Days_at_the_Movies;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

class Result {

    public static int beautifulDays(int i, int j, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int l = i; l <= j; l++) {
            list.add(l);
        }
        List<Integer> collectList = list.stream().map(a -> {
            int reversedNumber = 0;
            int numberToReverse = Math.abs(a);
            while (numberToReverse > 0) {
                int mod = numberToReverse % 10;
                reversedNumber = reversedNumber * 10 + mod;
                numberToReverse /= 10;}
            return a < 0 ? reversedNumber * -1 : reversedNumber;
        }).collect(toList());
        int count = 0;
        for (int l = 0; l < list.size(); l++) {
            double goodDay = ((double) list.get(l) - (double) collectList.get(l)) / (double) k;
            if ((goodDay - (int) goodDay) == 0) count++;
        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

