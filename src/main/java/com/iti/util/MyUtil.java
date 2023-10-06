package com.iti.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;



@Component
public class MyUtil {

	public static Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			// live connection
//			connection = DriverManager.getConnection("jdbc:postgresql://10.160.6.203:5432/itiap",
//					"itiap_25032022", "25032022_itiap");

//			//local connection
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/iti_plcmt", "postgres", "mknic123");
			//connection = DriverManager.getConnection("jdbc:postgresql://10.242.162.237:5432/iti_plcmt", "postgres", "mknic123");
			//connection = DriverManager.getConnection("jdbc:postgresql://10.96.64.62:5432/iti_plcmt", "postgres", "mknic123");
			System.out.println("connn ====iti_db_live_copy========> " + connection);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

	public String getTradeName(String trade_code) throws SQLException {
		String trade_name = "";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = MyUtil.getConnection();
			ps = con.prepareStatement("select trade_code,trade_name from ititrade_master where trade_code=?");
			ps.setInt(1, Integer.parseInt(trade_code));
			ResultSet rs = ps.executeQuery();
			System.out.println("======MyUtil===getTradeName(String trade_code)==ps=>" + ps);

			if (rs.next()) {
				trade_name = rs.getString("trade_name");
			}
		} catch (Exception e) {
			System.out.println("exception is--->" + e);
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		return trade_name;
	}
	
	public String getEntryDistCode(String ins_code) {
		String dist_code = "";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = MyUtil.getConnection();
			ps = con.prepareStatement("select dist_code from iti where iti_code=?");
			ps.setString(1, ins_code);
			ResultSet rs = ps.executeQuery();
			System.out.println("======MyUtil===getTradeName(String trade_code)==ps=>" + ps);

			if (rs.next()) {
				dist_code = rs.getString("dist_code");
			}
		} catch (Exception e) {
			System.out.println("exception is--->" + e);
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		return dist_code;
		
	}

//	public boolean findUser(String userName, String ins_code) throws SQLException {
//
//		Connection con = null;
//		PreparedStatement ps = null;
//		try {
//			con = MyUtil.getConnection();
//			ps = con.prepareStatement("select * from login_users where username=? and ins_code=? and status is true");
//			ps.setString(1, userName);
//			ps.setString(2, ins_code);
//			ResultSet rs = ps.executeQuery();
//
//			if (!rs.next() && rs.getRow() == 0) {
//				return false;
//			} else {
//				return true;
//			}
//
//		} catch (Exception e) {
//			System.out.println("exception is--->" + e);
//			e.printStackTrace();
//			try {
//				con.rollback();
//			} catch (SQLException e2) {
//				e2.printStackTrace();
//			}
//			try {
//				if (ps != null) {
//					ps.close();
//				}
//				if (con != null) {
//					con.close();
//				}
//			} catch (SQLException e3) {
//				e3.printStackTrace();
//
//			}
//		}
//		return false;
//	}

}

