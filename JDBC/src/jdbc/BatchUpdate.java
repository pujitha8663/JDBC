package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class BatchUpdate {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps= null;
		try {
			ArrayList<Student> st = new ArrayList<Student>();
			st.add(new Student("sriman",342,87351));
			st.add(new Student("potti", 321, 98762));
			st.add(new Student("manju", 123, 45367));
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","pujitha");
		ps= connection.prepareStatement("insert into student values(?,?,?)");
		for (Student student : st) {
			ps.setString(1, student.getName());
			ps.setInt(2, student.getId());
			ps.setDouble(3, student.getFee());
			ps.addBatch();
			
			
		}
		 int arrary[]=ps.executeBatch();
		 for (int i : arrary) {
			 System.out.println(i);
			
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
	}	
	}

}
