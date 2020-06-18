package day2;

public class ExceptionsDemo {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 10;

			double d = a / b;

			int[] nums = { 1, 2, 3, 4 };
			System.out.println(nums[3]);
			System.out.println("No Exceptions..");
			

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println(" you are caught here");
		}finally {
			System.out.println("Finally Executes..");
		}

		System.out.println("Normal Flow resumed..");
	}

}
