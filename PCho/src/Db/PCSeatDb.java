package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PCSeatDb {
	//pc�� �ڸ� ������ΰ͸� ��Ÿ����
		public static ArrayList<String> PCNum(String Seat[]) {

			String driver = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String password = "123456";
			String sql = null;

			String no = null;
			ArrayList<String> no1 = new ArrayList<String>();

			ResultSet rs;
			Connection con = null;
			PreparedStatement pst = null;

			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);

				sql = "select pc_state from Pcse where pc_code=?";

				pst = con.prepareStatement(sql);

				for (int i = 1; i < Seat.length; i++) {

					pst.setInt(1, Integer.parseInt(Seat[i]));

					rs = pst.executeQuery();

					while (rs.next()) {
						no = rs.getString(1);
					}
						if (no.equals("��� ��")) {
							no1.add(Seat[i]);
					}
				}
				
				if(no1.size()==0) {
					no1.add("���� ��� �����մϴ�");
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

			return no1;
		}

		//�α׾ƿ��� �ڸ��� �ٽ� ��� �������� �ٲ�
		public static int PCSeatAdd(String Seat) {

			String driver = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String password = "123456";
			String sql = null;
			
			
			Connection con = null;
			PreparedStatement pst = null;
			
			int rs = 0;
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				
				sql = "update PCse set pc_state=? where pc_code=?";
				pst = con.prepareStatement(sql);
				pst.setString(1, "��� ����");
				pst.setInt(2, Integer.parseInt(Seat));
				
				rs= pst.executeUpdate();
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return rs;
		}

		//�α��ν� �ڸ��� ��� ������ �ٲ�	
		public static int PCSeatSub(String Seat) {

			String driver = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String password = "123456";
			String sql = null;
			
			
			Connection con = null;
			PreparedStatement pst = null;
			
			int rs = 0;
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				
				sql = "update PCse set pc_state=? where pc_code=?";
				pst = con.prepareStatement(sql);
				pst.setString(1, "��� ��");
				pst.setInt(2, Integer.parseInt(Seat));
				
				rs= pst.executeUpdate();
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return rs;
		}

}
