package OOP3;

public class CheckingAccount extends BankAccount {
	 public CheckingAccount(double initialBalance) {
	        super(initialBalance);
	    }

	 @Override
	 public void withdraw(double amount) {
	        deposit(-amount);
	    }

}

