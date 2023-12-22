package Problem_Solving.Utopian_Tree;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    public static int utopianTree(int n) {
        int result =0;
        for (int i = 0; i <= n; i++) {
            if (i%2!=0) result = result * 2;
            if (i%2==0)  result++;
        }
//        int result = 0;
//        for (int i = 0; i <= n; i++)
//        {
//            boolean evenOrOdd = i % 2 == 0;
//            result = evenOrOdd ? result+1 : result*2;
//        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.utopianTree(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}