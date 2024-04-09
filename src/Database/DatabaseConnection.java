package src.Database;
import java.sql.*;

public class DatabaseConnection {

	public static void main(String[] args) {
	
		String query="create table student(id int primary key, name varchar(20));";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shivanidb","root","root");
			System.out.println("Connection successfull..!!");
			PreparedStatement stmt= con.prepareStatement("insert into ");
			int count=stmt.executeUpdate(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
