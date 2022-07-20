package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {

	public static Connection getConnection() {
		Connection con=null;
		try {
			// load driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create connection with DB
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itv", "root","root");
	}
		catch(Exception e) {System.out.println(e);}
		return con;
}
	
	public static int save(Employee emp) {
		int status =0;
		try {
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?)");
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getUsername());
			ps.setString(3, emp.getPassword());
			status = ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static List<Employee> getAllEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		try {
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("Select * from emp");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setUsername(rs.getString(3));
				emp.setPassword(rs.getString(4));
				list.add(emp);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
