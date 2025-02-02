package TwoDarray;

public class Main {
	 public static void main(String[] args) {
	        BankAccount account = new BankAccount();

	        account.deposit(10000);

	        account.withdraw(143);
	        
	        System.out.println("Текущий баланс: " + account.getBalance());
	    }
}
