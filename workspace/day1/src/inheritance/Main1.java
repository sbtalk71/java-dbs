package inheritance;

public class Main1 {

	public static void main(String[] args) {
		
		Person p=new Person(102, "A");
		
		Employee e= new Employee(100, "Scott", 67000);
		System.out.println(e.getDetails());
		
		TraineeEmp t= new TraineeEmp(100, "Scott", 67000,"good");
		System.out.println(t.getDetails());
		
		System.out.println(t);
		
		p=t;
		System.out.println(p.getDetails());
		
		Person p1=new Person(102, "A");
		//Employee e3=(Employee)p1;
		//System.out.println(e3.getDetails());
		

	}

}
