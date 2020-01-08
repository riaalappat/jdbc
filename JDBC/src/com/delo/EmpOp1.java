package com.delo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Scanner;

public class EmpOp1 {

	public static void main(String[] args) {
			try {
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter deptno");
				int deptno=Integer.parseInt(br.readLine());
				System.out.println("Enter dept name");
				String dname=br.readLine();
				System.out.println("Enter location");
				String location=br.readLine();
				
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
				PreparedStatement psmt=con.prepareStatement("insert into dept values(?,?,?)");
				psmt.setInt(1, deptno);
				psmt.setString(2, dname);
				psmt.setString(3, location);
				
				int r=psmt.executeUpdate();
				
				
					if (r>0) {
						System.out.println("data inserted");
					}
				
			}
				
				
			catch(Exception e) {
				System.out.println(e);
				
			}
			
			
			
		}

}
