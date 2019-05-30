package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoy {
	
	public Connection getConnection(){
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bleach?user=root&password=160494&useTimezone=true&serverTimezone=UTC&useSSL=false");
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
