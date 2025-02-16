package OOP3;

public  class Main {
	public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount(500.0);

        checking.deposit(200.0);
        checking.withdraw(100.0);

        System.out.println("Баланс расчетного счета: " + checking.getBalance());
    }
}
