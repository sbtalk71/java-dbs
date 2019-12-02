package interfaces;

public class OracleDb implements MyConnection{

	@Override
	public void getConnectionInfo() {
		System.out.println("Oracle DB Connection");
		
	}

	@Override
	public void getDBDetails() {
		System.out.println("Oracle DB version 11g");
		
	}

	@Override
	public void init() {
		System.out.println("DB Initialized...");
	}
}
