package Java.Java_Generics;

public class Solution {

    public static void main(String[] args) {
        Integer[] intArr = { 1, 2, 3 };
        String[] strArr = { "Hello", "World" };

        Solution.printArray(intArr);
        Solution.printArray(strArr);
        // два варианта событий или отдельный класс или метод
//        Printer.printArray(intArr);
//        Printer.printArray(strArr);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
     static <T extends Object> void printArray(T [] t) {
            for(T x: t) {System.out.println(x);}
    }
}
class Printer {
    public static <T> void printArray(T[] arr) {
        for (T e : arr)
            System.out.println(e);
    }
}
