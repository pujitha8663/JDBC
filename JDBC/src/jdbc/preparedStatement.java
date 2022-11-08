package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class preparedStatement {
	public static void main(String[] args) {
		java.sql.Connection con= null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","pujitha");
	 ps = con.prepareStatement("insert into student values(?,?,?)");
	ps.setString(1, "puja");
	ps.setInt(2, 342);
	ps.setDouble(3, 23456.4);
	ps.executeUpdate();
	System.out.println("success");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		finally {
			try {
				con.close();
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
		}
		
		
		
		
		
		}
		
	}


