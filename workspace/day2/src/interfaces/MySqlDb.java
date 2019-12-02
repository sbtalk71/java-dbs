package interfaces;

public class MySqlDb implements MyConnection{

	@Override
	public void getConnectionInfo() {
		System.out.println("MySQL DB Connection");
		
	}

	@Override
	public void getDBDetails() {
		System.out.println("MySQL DB version 5.7");
		
	}

}
