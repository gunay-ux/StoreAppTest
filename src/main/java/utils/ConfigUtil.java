package utils;

import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ConfigUtil {
	
	public static Properties readProperties(String fileName) throws IOException {
		
		fileName = fileName.trim();
		InputStream fileReader = new FileInputStream(fileName);
		Properties property = new Properties();
		property.load(fileReader);
	    
		return property;
	}

}
