package inheritance;

public class C extends B{

	public C() {
		System.out.println("C's constructor..");
	}
	
	
	public void show(int num,String...args) {
		System.out.println(args.length);
	}
}
