package src.propertiesDemo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class propertiesDemo {

	public static void main(String[] args) {
		
		try {
			Properties p= new Properties();
			FileInputStream fs= new FileInputStream("db.properties");
			p.load(fs);
			
			String url=p.getProperty("url");
			String uid= p.getProperty("uid");
			String password= p.getProperty("password");
			
			System.out.println(url);
			System.out.println(uid);
			System.out.println(password);
			
			Connection con=DriverManager.getConnection(url,uid,password);
			System.out.println("Success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
