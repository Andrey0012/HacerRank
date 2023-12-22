package Problem_Solving.Time_Conversion;

import java.io.*;

class Result2 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String multiTime = "";
        String hours = s.substring(0, 2);
        String timeBody = s.substring(2, 8);
        String timeFormat = s.substring(8, 10);
        if (timeFormat.equals("AM")) {
            if (hours.equals("12")) {
                multiTime = "00" + timeBody;
            } else multiTime = hours + timeBody;
        }
        if (timeFormat.equals("PM")) {
            if (hours.equals("12")) {
                multiTime = hours + timeBody;
            } else {
                int i = Integer.parseInt(hours) + 12;
                multiTime = String.valueOf(i) + timeBody;
            }
        }
        return multiTime;
    }
}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result2.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}