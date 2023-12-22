package Problem_Solving.Staircase;

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
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        String spaces =" ";
        String symbols ="#";
        int wsIterator =n-1;
        int smblIterator =1;
        for (int i = 0; i < n; i++) {
            String line = Stream.concat(Stream.generate(() -> spaces).limit(wsIterator),
                            Stream.generate(() -> symbols).limit(smblIterator))
                    .reduce("", (res, entry) -> res.concat(entry));
            System.out.println(line);
            wsIterator--;
            smblIterator++;
        }
    }
}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result2.staircase(n);

        bufferedReader.close();
    }
}

