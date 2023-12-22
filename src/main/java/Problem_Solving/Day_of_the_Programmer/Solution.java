package Problem_Solving.Day_of_the_Programmer;

import java.io.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.GregorianCalendar;

class Result {
    public static String dayOfProgrammer(int year) {

        GregorianCalendar gregorianCalendar = new GregorianCalendar(year, 1, 1);
        gregorianCalendar.setGregorianChange(Date.valueOf(LocalDate.of(1918, 2, 14)));
        gregorianCalendar.add(GregorianCalendar.DAY_OF_YEAR,
                256 - gregorianCalendar.get(GregorianCalendar.DAY_OF_YEAR));
        return String.format("%02d.%02d.%04d",
                gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH),
                gregorianCalendar.get(GregorianCalendar.MONTH) +1 ,
                gregorianCalendar.get(GregorianCalendar.YEAR));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
