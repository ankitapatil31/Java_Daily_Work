package april8.Comparator;

import java.util.Comparator;

public class AccountBalanceComparator implements Comparator<BankClass> {

    @Override
    public int compare(BankClass o1, BankClass o2) {
        return (int) (o1.balance - o2.balance);
    }
}
