package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewMemberDb {
	//ȸ������ �����ͺ��̽�

	public static void  NewMember(String id, String pwd, String name, String tel) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = null;

		Connection con = null;
		PreparedStatement pst = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			sql = "insert into Pcme(Pm_id,Pm_pwd,Pm_name,Pm_tel) values(?,?,?,?)";

			pst = con.prepareStatement(sql);

			pst.setString(1, id);
			pst.setString(2, pwd);
			pst.setString(3, name);
			pst.setString(4, tel);
			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//ID�ߺ�üũ
	public static boolean IDCheck(String id) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = null;

		boolean flag = false;
		
		Connection con = null;
		PreparedStatement pst = null;

		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			sql = "select * from Pcme where Pm_id=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			
			flag=pst.executeQuery().next();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}
}
