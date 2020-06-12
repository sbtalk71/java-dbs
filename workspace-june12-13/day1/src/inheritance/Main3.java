package inheritance;

public class Main3 {

	public static void main(String[] args) {
		Person p = new Employee(100, "Raju", 80000);

		System.out.println(p.getDetails());

		Employee e = new Employee(100, "Raju", 80000);

		if (e instanceof TraineeEmp) {
			TraineeEmp t = (TraineeEmp) e;

			t.getDetails();
		}

		Object o = "Demo example";

		if (o instanceof String) {
			String s = (String) o;

			System.out.println(s);
		}

		// Integer i=(Integer)o;

	}

}
