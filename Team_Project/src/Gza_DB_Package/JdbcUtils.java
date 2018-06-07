package Gza_DB_Package;

import java.sql.*;

public class JdbcUtils {
	Connection conn = null;

	public Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "team1";
		String password = "1234";

		conn = DriverManager.getConnection(url, id, password);

		return conn;
	}

	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void commit(Connection conn) {
		try {
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
