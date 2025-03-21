package mar15.Payment;

public class MainCls {
    public static void main(String[] args) {

        // upcasting

        PaymentBaseCls paymentBaseCls = new InteractCls();
        paymentBaseCls.makePayment(100);
    }
}
