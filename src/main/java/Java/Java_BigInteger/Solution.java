package Java.Java_BigInteger;

import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigInteger i = new BigInteger(scanner.nextLine());
        BigInteger i1 = new BigInteger(scanner.nextLine());
        BigInteger bigInteger = new BigInteger("45544");
        BigInteger sum = i.add(i1);
        BigInteger multiply = i.multiply(i1);
        System.out.println(sum);
        System.out.println(i.add(bigInteger));
        System.out.println(multiply);
    }
}
