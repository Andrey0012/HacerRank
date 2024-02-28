package Problem_Solving.Big_Sorting;

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

    public static List<String> bigSorting(List<String> unsorted) {
//        List<BigInteger> collect = unsorted.stream().map(BigInteger::new).sorted().collect(toList());
//        System.out.println(collect);
//        List<String> collect1 = collect.stream().map(String::valueOf).collect(Collectors.toList());
//        return collect1;

        Collections.sort(unsorted, new Comparator<String>(){
            @Override
            public int compare(String a, String b) {
                int n = a.length(), m = b.length();
                if (n == m) {
                    return a.compareTo(b);
                }
                return n - m;
            }
        });
        Collections.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        return unsorted;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.bigSorting(unsorted);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

