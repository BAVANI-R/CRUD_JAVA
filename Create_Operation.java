package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Create_Operation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","root");
			Statement st=con.createStatement();
			String query="insert into users(name,gender,contact) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,"Banu");
			ps.setString(2, "Female");
			ps.setInt(3, 1324567809);
			
			System.out.println(ps);
			ps.executeUpdate();
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}

	}

}
