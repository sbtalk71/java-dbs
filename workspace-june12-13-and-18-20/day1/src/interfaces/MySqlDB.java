package interfaces;

public class MySqlDB implements MyConnection{

	@Override
	public String getConnectionInfo() {
		
		return "MySQL DB Connection";
	}
	
	@Override
	public String getDatabaseDetails() {
		
		return "MySQL Database 5.7";
	}
}
