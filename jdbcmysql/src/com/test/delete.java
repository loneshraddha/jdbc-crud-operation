package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shradb","root","Lone@8080");
		Statement st=con.createStatement();
		
		String del="delete from student where Student_no=4";
		int count1=st.executeUpdate(del);
		if(count1!=0) {
			System.out.println("Record Deleted ");
		}
		else {
			System.out.println("Record not deleted ");
		}
		st.close();
		con.close();
		
		

	}

}
