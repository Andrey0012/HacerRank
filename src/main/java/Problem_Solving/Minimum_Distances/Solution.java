package Problem_Solving.Minimum_Distances;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static int minimumDistances(List<Integer> a) {
        ArrayList<ArrayList<Integer>> integers = new ArrayList<>();
        for (int i = 0; i < a.size()-1; i++) {
            ArrayList<Integer> integers1 = new ArrayList<>();
            integers1.add(a.get(i));
            integers1.add(a.get(i+1));
            integers.add(integers1);
        }
        System.out.println(integers);
        return 0;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

