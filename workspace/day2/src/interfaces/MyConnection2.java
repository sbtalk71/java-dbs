package interfaces;

public interface MyConnection2 {
	
	float version=1.0f;

	public void getConnectionInfo();
	public void getDBDetails();
	default public void init(int x) {};
}
