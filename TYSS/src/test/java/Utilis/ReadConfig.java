package Utilis;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class ReadConfig {
	Properties prop;
	
	 public ReadConfig() {
		File src= new File("./Config/Config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
			}
		catch (Exception e) {
			System.out.println("Exception");
		}
	}
		public String getURL() {
			String Url=prop.getProperty("URL");
			return Url;
			
		}
		
	}

