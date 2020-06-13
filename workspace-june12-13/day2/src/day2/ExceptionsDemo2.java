package day2;

public class ExceptionsDemo2 {

	public static void main(String[] args) {
		
		int x=11;
		try {
		if(x>10) {
			throw new RuntimeException("its not 10");
			
		}
		}catch (RuntimeException e) {
			//e.printStackTrace();
			System.out.println(e);
			throw new ArithmeticException();
		}

	}

}
