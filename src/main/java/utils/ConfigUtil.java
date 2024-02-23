package utils;

import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;


public class ConfigUtil {
	
	public static Properties readProperties(String fileName) throws Exception {
		
		fileName = fileName.trim();
		InputStream fileReader = new FileInputStream(fileName);
		Properties property = new Properties();
		property.load(fileReader);
		System.out.println("property"+property);
		
	
	    
		return property;
	}

}
