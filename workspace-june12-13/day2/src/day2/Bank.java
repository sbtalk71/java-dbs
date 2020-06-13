package day2;

public class Bank {

	private double balance=10000;
	
	public double withdraw(double amount) throws LowBalanceException{
		if(balance<amount) {
			throw new LowBalanceException("Your Balance is Low : "+balance);
		}else {
			balance=balance-amount;
			System.out.println("Transaction Success...");
			return balance;
		}
	}
}
