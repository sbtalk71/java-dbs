
public class Test {

	public static void main(String[] args) {
		
		Emp e= new Emp();
		
		Address addr=new Address();
		addr.setStreet("MG Street");
		
		e.setAddress(addr);
		
		System.out.println(e.getAddress().getStreet());

	}

}
