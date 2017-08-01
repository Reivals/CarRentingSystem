package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDatabase {
	
	//mich44,admin
	public static void getConnection(String url, String username, String password)
	{
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connection sucesfull");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
