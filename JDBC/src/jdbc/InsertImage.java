package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class InsertImage {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","pujitha");
			FileInputStream f = new FileInputStream("C:\\Users\\pujamarka\\OneDrive\\Pictures\\Video Projects\\potti.jpg");
			Date d = new Date();
			java.sql.Date e = new java.sql.Date(d.getTime());
			
			ps =con.prepareStatement("insert into data values(?,?,?,?)");
			ps.setInt(1, 34);
			ps.setString(2, "shan");
			ps.setBlob(3, f);
			ps.setDate(4, e);
			ps.execute();
			System.out.println("kale");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
