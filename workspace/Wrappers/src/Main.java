
public class Main {

	public static void main(String[] args) {
		int i=10;
		//Integer x=20;
		
		Double d = new Double(i);
		
		String s="hello";
		String s1="hello";
		String s2=new String("hello");
		System.out.println(s==s1);
		System.out.println(s1==s2);
		s1=s1+" world";
		System.out.println(s==s1);
	}

}
