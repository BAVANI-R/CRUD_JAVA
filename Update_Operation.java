package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Update_Operation {

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
			String query="update users set contact=? where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,"1234509876");
			ps.setInt(2,1);
			
			
			System.out.println(ps);
			ps.executeUpdate();
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}

	}

}
