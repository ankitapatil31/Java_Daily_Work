package mar15.Payment;

public class InteractCls extends PaymentBaseCls {

    @Override
    public int makePayment(int amount){
        System.out.println("Interact cls Amount "+amount );
        return amount;
    }
}
