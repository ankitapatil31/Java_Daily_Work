package mar18.Interface;

public class BMOBankCls implements BankInterface{

    float rate = 2.7f;
    BMOBankCls(float rate){
        this.rate = rate;
    }
    @Override
    public void getRateofInterest() {
        System.out.println("BMO Interest Rate"+ rate);
    }
}
