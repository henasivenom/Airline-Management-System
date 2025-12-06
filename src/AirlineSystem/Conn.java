package AirlineSystem;
import java.sql.*;

public class Conn {
	Connection c;
	Statement s;
	public boolean isConnected = false;
	
	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root","system");
			s = c.createStatement();
			isConnected = true;
		}
		catch (ClassNotFoundException e) {
			System.err.println("MySQL JDBC Driver not found: " + e.getMessage());
			isConnected = false;
		}
		catch (Exception e) {
			System.err.println("Database connection failed: " + e.getMessage());
			isConnected = false;
		}
	}
}
