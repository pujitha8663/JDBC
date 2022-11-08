package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpConnection {
	public static void main(String[] args) {
		java.sql.Connection connection = null;
		Statement state = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","pujitha");
	state = connection.createStatement();
	state.executeUpdate("insert into employee values('pavan','23456','643')");
			System.out.println("success");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		
		}catch (SQLException e) {
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
				state.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
