package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shradb","root","Lone@8080");
		Statement st=con.createStatement();
		String query="create table student(Student_no int(3) primary key,Student_name varchar(255),DOB date,DoJ date)";
		st.executeUpdate(query);
		System.out.println("Student table created successfully");
		String q="insert into student(Student_no,Student_name,DOB,DoJ)values(1,'Shraddha','2001-06-10','2019-07-21')";
		String q1="insert into student(Student_no,Student_name,DOB,DoJ)values(2,'Rushikesh','2002-09-17','2020-08-27')";
		String q2="insert into student(Student_no,Student_name,DOB,DoJ)values(3,'Sayali','2001-09-02','2019-08-15')";
		String q3="insert into student(Student_no,Student_name,DOB,DoJ)values(4,'Sonu','1997-05-11','2019-08-27')";
		int count=st.executeUpdate(q);
		st.executeUpdate(q1);
		st.executeUpdate(q2);
		st.executeUpdate(q3);
		if(count==0)
		{
			System.out.println("Record not inserted ");
		}
		else
		{
			System.out.println("Record inserted successfully!");
		}
		
		st.close();
		con.close();
		
		
	}
}