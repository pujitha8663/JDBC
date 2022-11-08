package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.mysql.cj.util.Util;

public class File_img_dd {
public static void main(String[] args) {
	Connection connection= null;
	PreparedStatement pr=null;
	  
	
	connection=jdbc.Util.getConnection();
	
	try {
		
		pr = connection.prepareStatement("insert into img_dd values(?,?,?,?)");
		pr.setInt(1,5);
		FileInputStream file = new FileInputStream("C:\\Users\\pujamarka\\Downloads\\flipkart.png");
		pr.setBlob(2, file);
		Date date = new Date();
	
		java.sql.Date da= new java.sql.Date(1999, 5, 9);
		pr.setDate(3,da);
		FileReader p= new FileReader("C:\\Users\\pujamarka\\OneDrive\\Desktop\\puja.txt");
		pr.setClob(4, p);
		pr.execute();
		System.out.println("sucess");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	finally {
		try {
			pr.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
	
	
	
	
	
}
}
