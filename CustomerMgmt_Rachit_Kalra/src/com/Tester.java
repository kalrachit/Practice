package com;

import java.sql.SQLException;
import com.ManagerDAO;
public class Tester {
	
	public static void main(String[] args) throws SQLException {	
	
		ManagerDAO dao = new ManagerDAO();
	
	try {
		boolean chk=dao.updateManager(991, "Delhi");
		System.out.println(chk);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}