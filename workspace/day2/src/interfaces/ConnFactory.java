package interfaces;

public class ConnFactory {

	public static MyConnection createDBConnection(String dbType) {
		if(dbType.equals("mysql")) {
			return new MySqlDb();
		}else if(dbType.equals("oracle")){
			return new OracleDb();
		}else {
			throw new RuntimeException("db does not exist..");
		}
	}
}
