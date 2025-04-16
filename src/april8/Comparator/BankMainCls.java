package april8.Comparator;

import java.util.*;

public class BankMainCls {
    public static void main(String[] args) {
        List<BankClass> list = new ArrayList<>();
        list.add(new BankClass(256, "Ankita", 123.0F));
        list.add(new BankClass(128, "Patel", 43.0F));
        list.add(new BankClass(1024, "Harsh", 1123.0F));

        Collections.sort(list,new NameComparator());
        System.out.println(list);

        Collections.sort(list,new AccountBalanceComparator());
        System.out.println(list);
    }
}
