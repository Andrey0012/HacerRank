package Problem_Solving.Time_Conversion;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        if (s.substring(8).equals("AM")) {
            if (s.substring(0, 2).equals("12")) {
                return "00" + s.substring(2, 8);
            } else {
                return s.substring(0, 8);
            }
        } else {
            if (s.substring(0, 2).equals("12")) {
                return s.substring(0, 8);
            } else {
                int hour = Integer.parseInt(s.substring(0, 2)) + 12;
                return String.format("%02d", hour) + s.substring(2, 8);
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   //     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
 //       bufferedWriter.close();
    }
}
