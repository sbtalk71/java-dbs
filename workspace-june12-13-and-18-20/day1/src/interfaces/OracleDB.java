package interfaces;

public class OracleDB implements MyConnection{

	@Override
	public String getConnectionInfo() {
		
		return "Oracle DB Connection";
	}
	
	@Override
	public String getDatabaseDetails() {
		
		return "Oracle Database 11g";
	}
}
