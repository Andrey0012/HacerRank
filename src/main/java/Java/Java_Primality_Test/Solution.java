package Java.Java_Primality_Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bigInteger = new BigInteger(n);
        if (bigInteger.isProbablePrime(1)){
            System.out.println("prime");
        } else System.out.println("not prime");

        bufferedReader.close();
    }
}
