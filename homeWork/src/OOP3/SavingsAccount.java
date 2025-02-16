package OOP3;

public class SavingsAccount extends BankAccount {
	private double minimumBalance;

    public SavingsAccount(String accountNumber, double initialBalance, double minimumBalance) {
        super(accountNumber, initialBalance);
        this.minimumBalance = minimumBalance;
    }

	

//    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount + minimumBalance) {
            deposit(-amount);
        } else {
            System.out.println("Недостаточно средств для снятия.");
        }
    }
 
    
}
