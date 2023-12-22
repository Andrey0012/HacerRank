package Java.Java_Lambda_Expressions;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    public PerformOperation isOdd() {
        PerformOperation performOperation = (num) -> num%2>0;
        return performOperation;
    }
    public PerformOperation isPrime () {
        PerformOperation performOperation = (num) -> {
        BigInteger bigInteger = BigInteger.valueOf(num);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(num));
            return probablePrime;
        };
        return performOperation;
    }
    public PerformOperation isPalindrome () {
        PerformOperation performOperation = (num) -> {
            String intStr = String.valueOf(num);
            return intStr.equals(new StringBuilder(intStr).reverse().toString());
        };
        return performOperation;
    }
}

    public class Solution {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T--> 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }
