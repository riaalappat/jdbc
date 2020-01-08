package com.delo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.PreparedStatement;

public class EmpOp2 {
	
	public static void main(String[] args) {
		
			try 
			{
				
				
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
				if(con!=null) 
				{
					//Statement smt=con.createStatement();
					System.out.println("Successful");
	
				}
				int NO=Integer.parseInt(br.readLine());
				String NAME=br.readLine();
				String LOC=br.readLine();
				
				PreparedStatement psmt=con.prepareStatement("insert into dept values(?,?,?)");
				
				psmt.setInt(1,NO);
				psmt.setString(2,NAME);
				psmt.setString(3,LOC);
				
				int r=psmt.executeUpdate();
				if(r>0) {
					System.out.println(r+"Data inserted");
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
	

}
}
