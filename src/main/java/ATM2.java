import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ATM2 {

    private Map<Integer, Integer> cash = new LinkedHashMap<>();


    public ATM2(int quantity100, int quantity500, int quantity1000, int quantity5000) {
        cash.put(5000, quantity5000);
        cash.put(1000, quantity1000);
        cash.put(500, quantity500);
        cash.put(100, quantity100);
    }

    public Map<Integer, Integer> getCash(Integer moneyCash) {
        Map<Integer, Integer> result = new HashMap<>();
        if (moneyCash < 0 || moneyCash % 100 != 0) {
            System.out.println("недопустимая сумма12");
            return result;
        }

        Map<Integer, Integer> tempCash = new HashMap<>(cash);

        AtomicInteger money = new AtomicInteger(moneyCash);
        cash.forEach((key, value) -> {

            int currentSum = money.get() % key;
            int currentCount = money.get() / key;

            if (value < currentCount) {
                if (key == 100) {
                    cash.clear();
                    cash.putAll(tempCash);
                    System.out.println("не хватает купюр номиналов " + key);
                }
                result.put(key, value);
                money.set(money.get() - key * value);
                tempCash.put(key, 0);
            } else {
                result.put(key, currentCount);
                money.set(currentSum);
                Integer currentCountMoninal = tempCash.get(key);
                tempCash.put(key, currentCountMoninal - currentCount);
            }

        });
        cash.clear();
        cash.putAll(tempCash);


        return result;
    }


    public static void main(String[] args) {

        ATM2 atm2 = new ATM2(2, 0, 3, 2);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i = scanner.nextInt();
            if (i == -1) break;

            Map<Integer, Integer> cash = atm2.getCash(i);
            System.out.println("снято " + cash);
            System.out.println("осталось " + atm2.getCurrentCash());
        }
    }

    private Map<Integer, Integer> getCurrentCash() {
        return cash;


    }
}
