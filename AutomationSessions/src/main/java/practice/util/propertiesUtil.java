package practice.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesUtil {

	private Properties prop = null;
	public String env = "local";
	
	public void PropertiesUtil () throws FileNotFoundException, IOException {
		
		
		
		if(System.getProperty("Env") != null)
		{
			try {
				this.prop = new Properties();
				prop.load(new FileInputStream(env+"_"+"properties"));
				
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch  (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public String getPropertyValue(String key) {
		return prop.getProperty(key);
	}
}
