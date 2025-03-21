package mar18.Interface;

public class RBCBankCls implements BankInterface{

    float rate = 2.5f;
    RBCBankCls(float rate){
        this.rate = rate;
    }
    @Override
    public void getRateofInterest() {
        System.out.println("RBC Interest Rate"+ rate);
    }
}
