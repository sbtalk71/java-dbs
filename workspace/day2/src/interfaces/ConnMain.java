package interfaces;

public class ConnMain {

	public static void main(String[] args) {
		
		MyConnection con=ConnFactory.createDBConnection("vv");
		
		con.getConnectionInfo();
		con.getDBDetails();

		
	}

}
