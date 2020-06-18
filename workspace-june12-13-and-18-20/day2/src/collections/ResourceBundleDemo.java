package collections;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		
		ResourceBundle bundle=ResourceBundle.getBundle("myconfig",Locale.UK);
		
		Enumeration<String> keys=bundle.getKeys();
		
		while(keys.hasMoreElements()) {
			String key=keys.nextElement();
			System.out.println(bundle.getObject(key));
		}

	}

}
