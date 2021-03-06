package Gza_Process_Package;

import java.sql.*;

import Gza_DB_Package.GZA_USER_INFO;
import Gza_DB_Package.JdbcUtils;

public class GZA_DAO {
	Connection conn = null;
	JdbcUtils jdbc = new JdbcUtils();

	public GZA_USER_INFO searchID(String name, String pw) {
		String sql = "select * from user_table where u_name = ? and u_pw = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GZA_USER_INFO uinfo = null;
		try {
			conn = jdbc.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				uinfo = new GZA_USER_INFO(
						rs.getString("u_id"), 
						rs.getString("u_pw"), 
						rs.getString("u_name"), 
						rs.getInt("u_money"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbc.close(conn, pstmt, rs);
		}
		return uinfo;
	}

	public GZA_USER_INFO searchPW(String id, String name) {
		String sql = "select * from user_table where u_id = ? and u_name = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GZA_USER_INFO uinfo = null;
		try {
			conn = jdbc.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);
			pstmt.setString(2, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				uinfo = new GZA_USER_INFO(rs.getString("u_id"), rs.getString("u_pw"), rs.getString("u_name"), rs.getInt("u_money"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbc.close(conn, pstmt, rs);
		}
		return uinfo;
	}

	public boolean IdCheck(String id) {
		boolean check = true;
		String sql = "select * from user_table where u_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = jdbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(!rs.next()) {
				check = false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbc.close(conn, pstmt, null);
		}
		
		
		return check;
	}

	public boolean Register(GZA_USER_INFO uinfo) {
		String sql = "input into user_table values (?,?,?,?)";
		PreparedStatement pstmt = null;
		int insertSuccess;
		boolean check = false;
		try {
			conn = jdbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uinfo.getUSER_ID());
			pstmt.setString(2, uinfo.getUSER_PW());
			pstmt.setString(3, uinfo.getUSER_NAME());
			pstmt.setInt(4, uinfo.getUSER_ASSETS());
			insertSuccess = pstmt.executeUpdate();
			
			if(insertSuccess > 0) {
				check = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
	
	
	
}
