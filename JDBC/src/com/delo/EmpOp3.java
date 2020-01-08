package com.delo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.PreparedStatement;

public class EmpOp3 {

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
					
					System.out.println("Enter deptno to update:");
					int NO=Integer.parseInt(br.readLine());
					System.out.println("Enter dname and location:");
					String n=br.readLine();
					String l=br.readLine();
					
					PreparedStatement psmt=con.prepareStatement("update dept set dname=?,location=? where deptno=?");
					
					
					psmt.setString(1,n);
					psmt.setString(2,l);
					psmt.setInt(3,NO);
					
					int r=psmt.executeUpdate();
					if(r>0) {
						System.out.println("Data updated");
					}
					
				}
				catch(Exception e) {
					System.out.println(e);
					
				}
		

	}
	}



