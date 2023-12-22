package Problem_Solving.Picking_Numbers;

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
    public static int pickingNumbers(List<Integer> a) {
        ArrayList<Integer> listMax = new ArrayList<>();
        for(Integer team1: a) {
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < a.size(); i++)  {
                if(team1.equals(a.get(i)) || (a.get(i)-team1)==1) {
                    list1.add(a.get(i));
                }
            }
            for (int i = 0; i < a.size(); i++)  {
                if(team1.equals(a.get(i)) || (team1-a.get(i))==1) {
                    list2.add(a.get(i));
                }
            }
            listMax.add(list1.size());
            listMax.add(list2.size());

        }
        return listMax.stream().max(Integer::compareTo).get();
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

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

