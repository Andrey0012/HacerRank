package Problem_Solving.Migratory_Birds;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

//    public static int migratoryBirds(List<Integer> arr) {
//        int count = 0;
//        HashMap<Integer, Integer> objectBirds = new HashMap<>();
//        arr.forEach(a -> {
//            int quantity =0;
//            for (int i = 0; i < arr.size(); i++) {
//                if (arr.get(i)==a ) { quantity++;}
//            }
//            objectBirds.put(a,quantity );
//        });
//
//        ArrayList<Integer> integers = new ArrayList<>(objectBirds.values());
//        Collections.sort(integers);
//        for (int i = 1; i <= 5; i++) {
//                if (objectBirds.get(i) == integers.get(integers.size() - 1)) {
//                    count = i;
//                    break;
//            }
//        }
//        return count;
//    }
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> objectBirds = arr.stream().distinct().collect(Collectors.toMap(t -> t, t -> 0));
        arr.forEach(a -> objectBirds.computeIfPresent(a, (key, value) -> value + 1));

        AtomicInteger currentKey = new AtomicInteger(Integer.MAX_VALUE);
        AtomicInteger currentValue = new AtomicInteger(0);

        objectBirds.forEach((key, value) -> {
            if(value > currentValue.get()){
                currentKey.set(key);
                currentValue.set(value);
            }
        });

        return currentKey.get();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
