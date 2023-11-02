package Java.Java_Exception_Handling_Try_catch;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

//        Integer next = Integer.valueOf(scanner.next());
//        Integer next2 = Integer.valueOf(scanner.next());
        try {
            String next0 = scanner.nextLine();
            String next1 = scanner.nextLine();
            System.out.println(Integer.valueOf(next0)/Integer.valueOf(next1));
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }catch (NumberFormatException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}