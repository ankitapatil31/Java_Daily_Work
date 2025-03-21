package mar15.Payment;

public class CreditCardCls extends PaymentBaseCls{

    @Override
    public int makePayment(int amount){
        System.out.println("CreditCard Cls Amount "+amount);
        return amount;
    }
}
