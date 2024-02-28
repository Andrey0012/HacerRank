package Problem_Solving.Append_and_Delete;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Result1 {

    public static String appendAndDelete(String s, String t, int k) {

        String[] splitS = s.split("");
        String[] splitT = t.split("");
        ArrayList<Object> listS = new ArrayList<>();
        ArrayList<Object> listT = new ArrayList<>();
        Collections.addAll(listS, splitS);
        Collections.addAll(listT, splitT);
        int min = Math.min(t.length(), s.length());
        int max = Math.max(t.length(), s.length());
        if ((s.length() + t.length()) <= k) return "Yes";
        if ((max-min)!=0 && k%(max-min)==1) return "Nod";
        for (int i = 0; i < min; i++) {
            if ((listS.get(min-1).equals(listT.get(min-1)))&& i==min-1) {
                if ((s.length() - i ) + (t.length() - i ) <= k) {
                    return "Yes";
                }
                else return "No";
            }
            if (!listS.get(i).equals(listT.get(i))) {
                if ((s.length() - i ) + (t.length() - i ) <= k) {
                    return "Yes";
                }
                else return "No";
            }
        }
        return "No";
    }
}
public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result1.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

