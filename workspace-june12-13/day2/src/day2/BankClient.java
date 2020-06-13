package day2;

public class BankClient {

	public static void main(String[] args) throws Exception {

		//try {
			Bank b = new Bank();
			System.out.println(b.withdraw(5000));

			System.out.println(b.withdraw(5001));
		//} catch (LowBalanceException e) {
		//	System.out.println(e);
		//}

	}

}
