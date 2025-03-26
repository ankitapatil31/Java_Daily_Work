package mar22.InsufficientException;

public class MyBankCls {
    int accountBalance = 200;
    void CheckBalance(){
        System.out.println("Your balance is "+accountBalance);
    }
    void withdraw (int amount) throws InSufficientException {
        if(amount > accountBalance){
             throw new InSufficientException("Insufficient Balance");
        }
        System.out.println("Last Line");
    }
    void deposite(){
        System.out.println("deposite");
    }
}

