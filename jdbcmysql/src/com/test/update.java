package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {
	public static void main(String []args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shradb","root", "Lone@8080");
		Statement st=con.createStatement();
		
		String query="update student set Student_name='Shraddha Lone'where Student_no=1";
		int count=st.executeUpdate(query);
		if(count!=0)
		{
			System.out.println("Record updated");
		}
		else {
			System.out.println("Record not updated");
		}
		st.close();
		con.close();
	}

}
