package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	 Properties prop;

	 public void loadconfig() {
		 
		 File src = new File("./Configuration/config.properties");
		 
		 try {
			 FileInputStream input = new FileInputStream(src);
			 prop = new Properties();
			 prop.load(input);
		 }
		 catch(Exception e) {
			 System.out.println("Exception is " + e.getMessage());
			 e.getStackTrace();
		 }
		
	 }
	 	
//	 	public String getBrowser() {
//	 		String browser = prop.getProperty("browser");
//	 		return browser;
//	 	}
	 	
		public String getApplicationURL() {
			String url = prop.getProperty("baseURL");
			return url;
		}
		
		public String getUsername() {
			String username = prop.getProperty("username");
			return username;
		}
		
		public String getPassword() {
			String password = prop.getProperty("password");
			return password;
		}
}
