import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ATM {

    //  int balanceATM;
    int balanceCard;
    public static int nominal100 = 100;
    public static int nominal500 = 500;
    public static int nominal1000 = 1000;
    public static int nominal5000 = 5000;
    int quantity100;    // количесво купюр
    int quantity500;    // количесво купюр
    int quantity1000;   // количесво купюр
    int quantity5000;   // количесво купюр

    public int balanceATMResult(int quantity100, int quantity500, int quantity1000, int quantity5000) {
        return quantity100 * nominal100 + quantity500 * nominal500 + quantity1000 * nominal1000 + quantity5000 * nominal5000;
    }

    public ATM(int balanceCard, int quantity100, int quantity500, int quantity1000, int quantity5000) {
        this.balanceCard = balanceCard;
        this.quantity100 = quantity100;
        this.quantity500 = quantity500;
        this.quantity1000 = quantity1000;
        this.quantity5000 = quantity5000;
    }

    public static int restMoney(int cash, int nominal, int quantity) {
        int sum = quantity * nominal;
        if (cash <= sum) {
            System.out.println("выдано " + nominal + " купюры:" + cash / nominal + " шт.");
            return cash % nominal;
        } else {
            System.out.println("выдано " + nominal + " купюры:" + sum / nominal + " шт.");
            return sum % nominal + cash - sum;
        }
    }

    public static int restQuantity(int cash, int nominal, int quantity) {
        int sum = quantity * nominal;
        if (cash <= sum) {
            quantity -= cash / nominal;
            System.out.println("осталось купюр в банкомате" + nominal + ": " + quantity + " шт.");
            return quantity;
        } else {
            quantity = quantity - sum / nominal;
            System.out.println("осталось купюр в банкомате" + nominal + ": " + quantity + " шт.");
            return quantity;
        }
    }

    public static int noCorrect(ATM atm, int cash) {
        int count = 0;
        //     List<Integer> listNominal =Arrays.asList(nominal5000, nominal1000, nominal500, nominal100);
        List<Integer> listNominal = Arrays.asList(nominal100, nominal500, nominal1000, nominal5000);
        HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(nominal5000, atm.quantity5000);
        objectObjectHashMap.put(nominal1000, atm.quantity1000);
        objectObjectHashMap.put(nominal500, atm.quantity500);
        objectObjectHashMap.put(nominal100, atm.quantity100);

        for (int i = 1; i < listNominal.size() - 1; i++) {
            int countExpect = cash / listNominal.get(i);
            if ((cash % listNominal.get(i + 1) / listNominal.get(i)) > objectObjectHashMap.get(listNominal.get(i))
                    &&
                    ((cash % listNominal.get(i + 1) / listNominal.get(i - 1)) > objectObjectHashMap.get(listNominal.get(i - 1)))) {
                System.out.println("Введена некоректная сумма");
                count++;
            }
        }
        return count;
    }

    public static void cashWithdrawal(ATM atm, int cash) {
        int i = ATM.noCorrect(atm, cash);
        int balanceATM = atm.balanceATMResult(atm.quantity100, atm.quantity500, atm.quantity1000, atm.quantity5000);
        if ((balanceATM - cash) < 0) {
            System.out.println("в банкомате не достаточно средств");
        } else if ((atm.balanceCard - cash) < 0) {
            System.out.println("на карте не достаточно средств");
        } else if (cash % nominal100 > 0) {
            System.out.println("Введена некоректная сумма, введите сумму кратную 100");
        } else if (i > 0) {
            ATM.noCorrect(atm, cash);
//        } else if ((cash % nominal500)>0) {
//            System.out.println("введите сумму кратную 500");
//        } else if (atm.quantity500 < (cash % nominal1000) / nominal500) {
//            System.out.println("введите сумму кратную 1000");
//        } else if (atm.quantity1000 < cash / nominal5000) {
//            System.out.println("введите сумму кратную 5000");
        } else if ((balanceATM - cash) >= 0 && (atm.balanceCard - cash) >= 0) {
            balanceATM -= cash;
            atm.balanceCard -= cash;

            int i5000 = restMoney(cash, nominal5000, atm.quantity5000);
            int quantity5000 = restQuantity(cash, nominal5000, atm.quantity5000);

            int i1000 = restMoney(i5000, nominal1000, atm.quantity1000);
            int quantity1000 = restQuantity(i5000, nominal1000, atm.quantity1000);

            int i500 = restMoney(i1000, nominal500, atm.quantity500);
            int quantity500 = restQuantity(i1000, nominal500, atm.quantity500);

            int i100 = restMoney(i500, nominal100, atm.quantity100);
            int quantity100 = restQuantity(i500, nominal100, atm.quantity100);
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(60000, 0, 1, 0, 10);
        ATM.cashWithdrawal(atm, 30600);
        System.out.println("баланс банкомата " + atm.balanceATMResult(atm.quantity100, atm.quantity500, atm.quantity1000, atm.quantity5000) + " шт.");
        System.out.println("баланс карты: " + atm.balanceCard + " шт.");
    }
}
