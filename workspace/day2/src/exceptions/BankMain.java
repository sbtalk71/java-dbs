package exceptions;

public class BankMain {

	public static void main(String[] args) {
		Account acc=new Account();
		try {
		acc.withdraw(3000);
		acc.withdraw(7001);
		}catch(LowBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Bank closes....");

	}

}
