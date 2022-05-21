package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class list {
	public static void main(String []args)throws Exception
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shradb","root", "Lone@8080");
	Statement st=con.createStatement();
	
	String q1="select * from Student where student_no=1 Or student_no=3";
	ResultSet r=st.executeQuery(q1);
	while(r.next()) {
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getDate(3)+" "+r.getDate(4));
		
	}
	
	st.close();
	con.close();
  }
}

