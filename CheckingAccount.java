package tutorial8;

public class CheckingAccount {
    private double balance = 0;
    private String number = "123-45678-9";
    public void deposit(double amount)throws InsufficientFundsException{
        if(this.balance <= 0){
            throw new InsufficientFundsException(amount);
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(this.balance < amount){
            throw new InsufficientFundsException(amount-this.balance);
        }
        this.balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getNumber(){
        return this.number;
    }
}
