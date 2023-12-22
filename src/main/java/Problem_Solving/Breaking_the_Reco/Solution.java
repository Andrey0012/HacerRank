package Problem_Solving.Breaking_the_Reco;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        ArrayList<Integer> result = new ArrayList<>();
        int highestScore =0;
        int lowestScore = 0;
//        Integer highestScore = scores.stream().reduce((s, a) -> {
//            int count = 0;
//            if (a > s) {
//                count++;
//            }
//            return count;
//        }).get();
//
//        Integer lowestScore = scores.stream().reduce((s, a) -> {
//            int count = 0;
//            if (a < s) {
//                count++;
//            }
//            return count;
//        }).get();
        int max = scores.get(0);
        int min = scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i)>max) {
                max = scores.get(i);
                highestScore++;
            }
            if (scores.get(i)<min) {
                min = scores.get(i);
                lowestScore++;
            }

        }
        result.add(highestScore);
        result.add(lowestScore);
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
