package Problem_Solving.Super_Reduced_String;

import java.io.*;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
//        for (int i = 0; i < s.length()-1; i++) {
//           if (i!=s.length()-1 && s.charAt(i)==s.charAt(i+1)){
//               s = s.substring(0, i - 1) + s.substring(i + 2, s.length());
//           }
//        }
//        if(s.isEmpty()){
//            return "Empty String";
//        }
//        return s;

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        if (sb.length() == 0) {
            return "Empty String";
        }
        return sb.toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

