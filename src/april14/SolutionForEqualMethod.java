package april14;

class Voucher1 {

    private Money value;
    private String store;

    Voucher1(int amount, String currencyCode, String store) {
        this.value = new Money(amount, currencyCode);
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("this class equal method");
        if (o == this)
            return true;
        if (!(o instanceof Voucher1))
            return false;
        Voucher1 other = (Voucher1) o;
        boolean valueEquals = (this.value == null && other.value == null)
                || (this.value != null && this.value.equals(other.value));
        boolean storeEquals = (this.store == null && other.store == null)
                || (this.store != null && this.store.equals(other.store));
        return valueEquals && storeEquals;
    }

    // other methods
}

public class SolutionForEqualMethod {
    public static void main(String[] args) {
        Money cash = new Money(42, "USD");
        Voucher1 obj = new Voucher1(42, "USD", "Amazon");
        System.out.println("----------------");
        System.out.println(obj.equals(cash));// false// As expected.
        boolean b1 = cash.equals(obj);
        System.out.println(b1);
    }
}
