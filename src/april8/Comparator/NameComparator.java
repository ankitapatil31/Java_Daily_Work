package april8.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<BankClass> {
    @Override
    public int compare(BankClass o1, BankClass o2) {
        return o1.getName().compareTo(o2.name);
    }
}
