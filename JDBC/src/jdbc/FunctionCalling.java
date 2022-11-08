package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.jdbc.CallableStatement;

public class FunctionCalling {
	public static void main(String[] args) {
		Connection con = null;
		java.sql.CallableStatement cs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","pujitha");
			cs=con.prepareCall("{?=call addition(?,?)}");
			cs.setInt(2, 16);
			cs.setInt(3, 10);
			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			System.out.println("result="+cs.getInt(1));
			
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
				cs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


