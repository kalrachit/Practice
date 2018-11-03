package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {

	private static final String DRIVERNAME="oracle.jdbc.driver.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME="SYSTEM";
	private static final String PASSWORD="Class123";
	
	public static Connection getConnection(){
		
		Connection con=null;
		try {
			Class.forName(DRIVERNAME);
			con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return con;
				
			
	}
	
	
	public static void closeConnection(Connection con){
		
		
		if(con!=null){
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
		}
		
	}
	
	
public static void closePreparedStmt(PreparedStatement pst){
		
		
		if(pst!=null){
			
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
		}
		
	}
}
