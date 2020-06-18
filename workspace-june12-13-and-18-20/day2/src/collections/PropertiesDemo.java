package collections;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
	
		Properties props=System.getProperties();
		
		for(Object o:props.keySet()) {
			System.out.println(o+" ------>"+props.getProperty(o.toString()));
		}

		
	}

}
