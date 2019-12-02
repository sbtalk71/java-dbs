package exceptions;

public class Account {
	private double balance = 10000;

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public double withdraw(double amount) {
		if (balance < amount) {
			throw new LowBalanceException("Low Balance");
		} else {
			balance = balance - amount;
			System.out.println("Transaction success..");
			return balance;
		}
	}
}
