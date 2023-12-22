package Java.Java_Dequeue;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int maxUniqueIntegers = 0;
        Set<Integer> uniqueIntegers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.offer(num);
            uniqueIntegers.add(num);
            if (deque.size() == m) {
                if (uniqueIntegers.size() > maxUniqueIntegers) {
                    maxUniqueIntegers = uniqueIntegers.size();
                }
                Integer removed = deque.pop();
                if (!deque.contains(removed)) {
                    uniqueIntegers.remove(removed);
                }
            }
        }

        System.out.println(maxUniqueIntegers);
    }
}
