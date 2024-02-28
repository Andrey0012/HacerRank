package Problem_Solving.Cut_the_sticks;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        //первый вариант
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(arr.size());
//        List<Integer> sorted = arr.stream().sorted().collect(toList());
//        for (int i = 0; i < arr.size(); i++) {
//            if (sorted.size() != 0) {
//                sorted.removeAll(Collections.singleton(sorted.get(0)));
//                if (sorted.size() != 0) list.add(sorted.size());
//            }
//        }
//        return list;


        //второй вариант
        List<Integer> sCut = new ArrayList<>();
        while(arr.size() > 0){
            sCut.add(arr.size());
            int min = Collections.min(arr);
            arr = arr.stream().filter(n->n>min).map(n->n-min).collect(Collectors.toList());
        }
        return sCut;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.cutTheSticks(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

