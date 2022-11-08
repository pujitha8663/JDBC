package jdbc;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
	public static java.sql.Connection connection = null;
	public static Properties properties = null;
	
	
	static {
	
		try {
			
		    Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","pujitha");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static java.sql.Connection getConnection() {
	return connection;	
	
		
	}
	public static void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   public static void close(ResultSet result,java.sql.Statement statement) {
	   
	   if(result!=null)
		try {
			result.close();
			statement.close();
			   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
	   public static void close(java.sql.Statement statement) {
		   try {
			statement.close();
			 connection.close();
			   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	   }
	   public static void main(String[] args) {
		System.out.println(Util.getConnection());
	}

}
