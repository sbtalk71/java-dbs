package interfaces;

public class Main {

	public static void main(String[] args) {
		//MyConnection conn=new OracleDB();
		MyConnection conn=new MySqlDB();
		
		System.out.println(conn.getConnectionInfo());
		
		System.out.println(conn.getDatabaseDetails());

	}

}
