package inheritance.abstrct;

public class Outer {

	int x = 10;

	class Inner1 {

		int x = 20;

		public void test() {
			System.out.println("From Inner2");
		}

	}

	static class Inner2 {
		int x = 30;

		public void test() {
			System.out.println("From Inner2");
		}

	}
}
