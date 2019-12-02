package exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;
			double d = a / b;
			String[] names = new String[10];// {"a","b","c"};
			System.out.println(names[0]);
			names[0].length();
			throw new RuntimeException("Just Kidding...");
			// System.out.println("In Try block waiting..");

		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally executes....");
		}
		System.out.println("Ok Code...");

	}

}
