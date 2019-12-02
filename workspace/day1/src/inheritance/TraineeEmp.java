package inheritance;

public class TraineeEmp extends Employee {
	private String performance;

	public TraineeEmp(int id, String name, double salary, String performance) {
		super(id, name, salary);
		this.performance = performance;
	}

	@Override
	public String getDetails() {
		
		return super.getDetails() + " " + performance;
	}
	
	
	@Override
	public String toString() {
		
		return "Trainee Class";
	}
	
	public void f1() {
		
	}
}
