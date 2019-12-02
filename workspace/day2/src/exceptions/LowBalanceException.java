package exceptions;

public class LowBalanceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LowBalanceException() {
		// TODO Auto-generated constructor stub
	}

	public LowBalanceException(String message) {
		super(message);
	}

	@Override
	public String toString() {

		return this.getClass().getName()+" : "+getMessage();
	}
}
