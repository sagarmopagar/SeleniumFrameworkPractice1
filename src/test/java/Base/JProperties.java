package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class JProperties {

	private static Properties prop = new Properties();

	@Test
	public static void loadProperties() {
		try {
		String currentDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(currentDir + "\\resources\\Util.properties");
		prop.load(fis);
		}catch (Exception e){
			System.out.println("Error reading proerties file");
		}
		
	}

	public static String getProperty(String key) {
		loadProperties();
		return prop.getProperty(key);
	}
	
}
