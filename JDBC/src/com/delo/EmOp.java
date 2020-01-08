package com.delo;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;


public class EmOp {
	public static void main(String[] args) {
		try{ 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
				if(con!=null) {
			System.out.println("Connection successful");
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from emp ");
			System.out.println("EMP IDS      EMP NAMES");
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+"                "+rs.getString(2));
				
			}
			}
			
			
		}
				
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		
	}

}
