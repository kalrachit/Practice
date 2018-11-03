package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ManagerDAO {
	
	public boolean updateManager( int mangerId, String branch) throws SQLException{
	
		boolean flag = false;
		Connection con = null;
		PreparedStatement pst = null;
		con = DatabaseUtil.getConnection();
		System.out.println("hi");
		if (con != null && branch != null && mangerId != 0) {
			// write the query and replace the hardcoded calues with ? because
			// you need to assign ? with the given inputs
			String sql = "UPDATE TBL_RelshipManger_1446232 SET branch=? WHERE managerid=?";
			// creating the prepared stmt with the help of connection
			System.out.println("hi2");
			pst = con.prepareStatement(sql);
			pst.setString(1, branch);
			pst.setInt(2, mangerId);
			
			int res = pst.executeUpdate();
			System.out.println(res);
			if (res > 0) {

				flag = true;
			}

			DatabaseUtil.closePreparedStmt(pst);
			DatabaseUtil.closeConnection(con);

	
	}
		return flag;
	}
}
