package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
	private static Connection con=null;
	
	public static Connection getDBConnection() throws Exception{
		if(con == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("co/edureka/java/jdbc/dbconfig");
			
			String dc = bundle.getString("jdbc.driverclass");
			String url = bundle.getString("jdbc.url");
			String user = bundle.getString("jdbc.username");
			String pass = bundle.getString("jdbc.password");
			
			Class.forName(dc);
			con = DriverManager.getConnection(url, user, pass);
		}
		
		return con;
	}
}
