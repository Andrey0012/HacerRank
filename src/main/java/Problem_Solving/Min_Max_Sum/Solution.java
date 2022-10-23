package Problem_Solving.Min_Max_Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);

        long mini = 0, max = 0;
        int x = 0, y = arr.size() - 1;

        for (int i = 0; i < arr.size() - 1; i++) {
            if ((1 <= arr.get(i))) {
                mini += arr.get(x);
                max += arr.get(y);
                x++;
                y--;
            }
        }

        System.out.print(mini + " " + max);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

