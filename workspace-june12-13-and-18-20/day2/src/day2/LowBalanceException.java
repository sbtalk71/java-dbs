package day2;

public class LowBalanceException extends Exception {

	public LowBalanceException() {
		
	}
	public LowBalanceException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		
		return "You have Low balance";
	}
}
