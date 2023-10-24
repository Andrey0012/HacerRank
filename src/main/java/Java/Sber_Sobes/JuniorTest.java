package Java.Sber_Sobes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JuniorTest {

    private static final String NA = "NA";

    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>(Arrays.asList("2", "A", "6", "B"));
        List<String> secondList = new ArrayList<>(Arrays.asList("1", "3", "5", "7", "9", " ff", "fgb"));

        int i1 = firstList.size() - secondList.size();

        if (i1 < 0) {
            for (int i = 0; i < Math.abs(i1); i++) {
                firstList.add("null");
            }
        } else {
            for (int i = 0; i < Math.abs(i1); i++) {
                secondList.add("null");
            }
        }

        firstList.forEach(
                first -> {
                    int index = firstList.indexOf(first);
                    String second = secondList.get(index);

                    try {
                        int firstInt = Integer.parseInt(first);
                        int secondInt = Integer.parseInt(second);
                        int sum = firstInt + secondInt;

                        System.out.println(firstInt + "+" + secondInt + "=" + sum);

                    } catch (NumberFormatException e) {
                        String sum = first.equals("null") || second.equals("null") ? NA : first + second;
                        System.out.println(first + "+" + second + "=" + sum);
                    }
                });

    }
}