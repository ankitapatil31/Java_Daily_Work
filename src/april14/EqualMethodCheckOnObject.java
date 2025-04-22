package april14;

class Money1 {
    int amount;
    String currencyCode;

    public Money1(int i, String usd) {
        this.amount = i;
        this.currencyCode = usd;
    }

}

public class EqualMethodCheckOnObject {
    public static void main(String[] args) {
        Money1 income = new Money1(55,"USD");
        Money1 expenses = new Money1(55, "USD");
        boolean balanced = income.equals(expenses);
        System.out.println("value of equal :"+balanced); // false
        /*
        * here out of this value is false because:  default method of equals for object check reference of that obj not values of object.
        *  # The default implementation of equals() in the Object class compares the identity of the object
        *
        *
        * @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof Money))
                return false;
            Money other = (Money)o;
            boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
              || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
            return this.amount == other.amount && currencyCodeEquals;
        }
        *
        *  we have three conditions to check:  whether the Money instance is the same as any other object.
        *  1) if the object is equal to itself it will return true.
        *  2) if it is not an instance of Money it will return false.
        *  3) we compare it with the attributes of another Money class instance.
        *     In detail, we ensure that all attributes of the compared class match those of the comparing class.
        *
        * */


    }
}
