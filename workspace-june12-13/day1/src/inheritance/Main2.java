package inheritance;

public class Main2 {

	public static void main(String[] args) {
		Employee e=new Employee(100, "Raju", 80000);
		
		System.out.println(e.getDetails());
		
		TraineeEmp t= new TraineeEmp(102, "Ankit", 67000, "Excellent");
		
		System.out.println(t.getDetails());

	}

}
