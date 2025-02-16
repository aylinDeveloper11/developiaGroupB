package OOP3;

public abstract class BankAccount {
	 private String accountNumber;
	    private double balance;

	    public BankAccount(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    public BankAccount(double initialBalance) {
	    	  this.balance = initialBalance;
	    }

		public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public abstract void withdraw(double amount);
}
