package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDb {
	// ������ �α��� �Ҷ� üũ�ϴ� db
	public static boolean UserLogin(String id, String pwd) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = null;
		String pwdCheck = "";

		boolean flag = false;

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			sql = "select Pm_pwd from Pcme where Pm_id=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				pwdCheck = rs.getString("Pm_pwd");
			}

			if (pwdCheck.equals(pwd)) {
				flag = true;

			} else if (!pwdCheck.equals(pwd)) {

				flag = false;
			}

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

	// ������ �α׾ƿ��� �ð�����ؼ� �����ͺ��̽��� ����
	public static boolean UserTimesub(String ID, String TimeCheck, String Time) {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = null;
		String sqlUpdate = null;
		String AllTime = "";
		String Timesend = "";

		boolean flag = false;

		Connection con = null;
		PreparedStatement pst = null;
		PreparedStatement pst2 = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			// Time�� �ǽð� timesend�� �� �ð�

			sql = "select pm_Time from Pcme where Pm_id=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, ID);
			rs = pst.executeQuery();

			while (rs.next()) {
				Timesend = rs.getString(1);
			}

			int idx = Timesend.indexOf(":");

			String hour = Timesend.substring(0, idx);
			String minute = Timesend.substring(idx + 1);

			// ���� insert�� Ÿ��
			int idxx = Time.indexOf(":");

			String hours = Time.substring(0, idxx);
			String minutes = Time.substring(idxx + 1);

			int intminut;
			int inthour = 0;

			int intmin = Integer.parseInt(minute);
			int intmins = Integer.parseInt(minutes);

			if (intmins > intmin) {
				intmin = intmin + 60;
				inthour = inthour - 1;
			}

			intminut = intmin - intmins;
			// 1���̶� 45���̸�?

			String Allminutes = Integer.toString(intminut);

			inthour = inthour + Integer.parseInt(hour) - Integer.parseInt(hours);

			String Allhour = Integer.toString(inthour);

			AllTime = Allhour + ":" + Allminutes;

			sqlUpdate = "update Pcme set Pm_time=? where Pm_id=?";
			pst2 = con.prepareStatement(sqlUpdate);
			pst2.setString(1, AllTime);
			pst2.setString(2, ID);
			pst2.executeUpdate();

			flag = true;

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

	// ������ �ð��� �ҷ����� db
	public static String UserTimeDb(String Pccombo, String id) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = null;
		String Time = "";

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

			sql = "select pm_time from PCme where pm_id=?";
			;
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();

			while (rs.next()) {
				Time = rs.getString(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Time;
	}

	// ������ �ð� �߰� ���� �����ͺ��̽�
	public static String UserTimeInsert(String ID, String PWD, String Time) {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = null;
		String sqlSelcet = null;
		String sqlUpdate = null;
		String sqlUpdate2 = null;
		String sqlTime = null;
		String pwdCheck = "";
		String TimeCheck = "";
		String AllTime = "";
		String Timesend = "";

		// boolean flag = false;

		Connection con = null;
		PreparedStatement pst = null;
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;
		PreparedStatement pst3 = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			sql = "select Pm_pwd from Pcme where Pm_id=?";

			pst = con.prepareStatement(sql);
			pst.setString(1, ID);
			rs = pst.executeQuery();

			while (rs.next()) {
				pwdCheck = rs.getString("Pm_pwd");
			}

			if (pwdCheck.equals(PWD)) {

				sqlSelcet = "select Pm_time from Pcme where Pm_id=?";

				pst1 = con.prepareStatement(sqlSelcet);
				pst1.setString(1, ID);
				rs1 = pst1.executeQuery();

				while (rs1.next()) {
					TimeCheck = rs1.getString(1);
				}

				System.out.println(TimeCheck);

				if (TimeCheck.equals(null) || TimeCheck.equals("00:00") || TimeCheck.equals("")) {
					sqlUpdate = "update Pcme set Pm_time=? where Pm_id=?";
					pst2 = con.prepareStatement(sqlUpdate);
					pst2.setString(1, Time);
					pst2.setString(2, ID);
					pst2.executeUpdate();
					// flag = true;

				} else {
					// �����ͺ��̽��� Ÿ��
					System.out.println(TimeCheck);
					int idx = TimeCheck.indexOf(":");

					String hour = TimeCheck.substring(0, idx);
					String minute = TimeCheck.substring(idx + 1);

					// ���� insert�� Ÿ��
					int idxx = Time.indexOf(":");

					String hours = Time.substring(0, idxx);
					String minutes = Time.substring(idxx + 1);

					int intminut;
					int inthour = 0;

					intminut = Integer.parseInt(minute) + Integer.parseInt(minutes);

					if (intminut >= 60) {
						int atom = (int) intminut / 60;
						intminut = intminut - atom * 60;
						inthour = inthour + atom;
					}

					String Allminutes = Integer.toString(intminut);

					inthour = inthour + Integer.parseInt(hour) + Integer.parseInt(hours);

					String Allhour = Integer.toString(inthour);

					AllTime = Allhour + ":" + Allminutes;

					sqlUpdate2 = "update Pcme set Pm_time=? where Pm_id=?";
					pst2 = con.prepareStatement(sqlUpdate2);
					pst2.setString(1, AllTime);
					pst2.setString(2, ID);
					pst2.executeUpdate();

					sqlTime = "select Pm_time from Pcme where Pm_id=?";

					pst3 = con.prepareStatement(sqlTime);
					pst3.setString(1, ID);
					rs2 = pst3.executeQuery();

					while (rs2.next()) {
						Timesend = rs2.getString(1);
					}

//						flag = true;
				}

			} else if (!pwdCheck.equals(PWD)) {

//					flag = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Timesend;
	}
}
