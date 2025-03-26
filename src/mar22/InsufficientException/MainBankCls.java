package mar22.InsufficientException;

public class MainBankCls{
    public static void main(String[] args) {
        MyBankCls obj = new MyBankCls();
        try{
            obj.withdraw(300);
        }
        catch (InSufficientException e){
            e.printStackTrace();
        }
        obj.deposite();

    }
}
