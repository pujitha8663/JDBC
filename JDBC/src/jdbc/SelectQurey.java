package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQurey {
	public static void main(String[] args) {
		
	
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet result=null;
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","pujitha");
		ps= connection.prepareStatement("select *from student");
	   result=ps.executeQuery();
	   while (result.next()) {
		   System.out.println("Name="+result.getString("Name")+" roll_number="+result.getInt("roll_number")+" fee="+result.getDouble("fee"));
	}
	   
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    finally {
    	try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}