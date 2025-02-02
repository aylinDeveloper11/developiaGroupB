package TwoDarray;

public class BankAccount {

    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнено на: " + amount + ". Текущий баланс: " + balance);
    }	
	
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Снято: " + amount + ". Текущий баланс: " + balance);
    }
    
    public double getBalance() {
        return balance;
    }
    
}
