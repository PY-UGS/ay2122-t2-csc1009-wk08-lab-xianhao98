package tutorial8;
import java.util.*;
public class BankDemoTest {
    public static void main(String[] args){
        char ans2;
        Scanner sc = new Scanner(System.in);
        CheckingAccount acc = new CheckingAccount();
        do{
        System.out.println("Do you want to deposit or withdraw: \n1) Deposit \n2) Withdraw");
        int ans = sc.nextInt();
        System.out.println("Enter the amount: ");
        double amount = sc.nextDouble();
        switch(ans){
            case 1:
            try{
                acc.deposit(amount);
                System.out.println("The balance after deposit is: $" + acc.getBalance());
            }catch (InsufficientFundsException e) {
                System.err.println("Sorry, u cannot deposit a negative amount");
            }
                break;
            case 2:
                try {
                    acc.withdraw(amount);
                    System.out.println("The balance after withdraw is: " + acc.getBalance());
                } catch (InsufficientFundsException e) {
                    System.err.println("Sorry, but your account is short by: $" + e.getAmount());
                }
                break;
        }
        System.out.println("Do you want continue(y/n) ?:");
        ans2 = sc.next().charAt(0);
    }while(ans2 == 'Y' || ans2 == 'y');
        sc.close();
    }
}
