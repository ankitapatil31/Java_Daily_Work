package april14;


class Money {
    int amount;
    String currencyCode;

    public Money(int i, String usd) {
        this.amount = i;
        this.currencyCode = usd;
    }
    public boolean equals(Object o) {
        if (o == this) {
            System.out.println("1st condition P");
            return true;
        }
        if (!(o instanceof Money))
        {
            System.out.println("2nd condition in P");
            return false;
        }
        System.out.println("3rd condition in P");
        Money other = (Money)o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return this.amount == other.amount && currencyCodeEquals;
    }
}
class WrongVoucher extends Money {

    private String store;

    public WrongVoucher(int i, String usd, String amazon) {
        super(i, usd);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof WrongVoucher)) {
            System.out.println("this 2nd condition");
            return false;
        }
        System.out.println("this 3nd condition");
        WrongVoucher other = (WrongVoucher)o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        boolean storeEquals = (this.store == null && other.store == null)
                || (this.store != null && this.store.equals(other.store));
        return this.amount == other.amount && currencyCodeEquals && storeEquals;
    }

    // other methods
}
public class NewEqualMethodImplimentation {
    public static void main(String[] args) {

        Money cash = new Money(42, "USD");
        WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");

        System.out.println(voucher.equals(cash));// false// As expected.
        boolean b1 = cash.equals(voucher); // true;// That's wrong.
        /*
        *  here In b1 return true.... which is wrong because in above same statement is false.. so this one should be false but its return true...
        *  because in equal method of parent class  "Money other = (Money)o;" this line
        *  convert child cls obj to parent class obj. thats why it return true... ( typecasing )
        *
        *
        * ######### Solution for this issue is In SolutionForEqualMethod file..
        * */
        System.out.println(b1);
    }
}
