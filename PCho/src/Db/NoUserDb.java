package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NoUserDb {
	//��ȸ���� �α��ν� �̸��� ��ġ�ҽ� �α����Ҽ��ֵ���
		public static boolean NoUserCheck(String Card, String name) {

			String driver = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String password = "123456";
			String sql = null;
			String nameCheck="";
			
			Connection con = null;
			PreparedStatement pst = null;
			ResultSet rs=null;
			
			boolean flag=false;
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				
				sql = "select nm_Name from PCnome where nm_Carnum=?";;
				pst = con.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(Card));
				rs= pst.executeQuery();
				
				while(rs.next()) {
					nameCheck=rs.getString("nm_Name");
				}
				
				if(nameCheck.equals(name)) {
					flag=true;
					
				}else if(!nameCheck.equals(name)){
					
					flag=false;
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
	
		//��ȸ�� ī�� ��ġ�ҽ� �ð� �ҷ�����
		public static String NoUserTime(String Card, String name) {

			String driver = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String password = "123456";
			String sql = null;
			String Time="";
			
			Connection con = null;
			PreparedStatement pst = null;
			ResultSet rs=null;
			
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				
				sql = "select nm_Time from PCnome where nm_Carnum=?";;
				pst = con.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(Card));
				rs= pst.executeQuery();
				
				while(rs.next()) {
					Time=rs.getString(1);
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
		
		//�ð� Ŭ�������� �ҷ����� db
		public static boolean TimeNoUserDb (String time) {

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
				
				sql = "select * from Pcti where ti_time=?";
				pst = con.prepareStatement(sql);
				pst.setString(1, time);
				
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

		//��ȸ���� �ð��߰� ������ �װ��� ����ϴ� �����ͺ��̽�
		public static int TimeNoUserInsertDb(String Card, String Time, String name) {

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
				
				sql = "insert into PCnome values(nm_seq1.nextval,?,?,?)";
				pst = con.prepareStatement(sql);
				pst.setString(1, Card);
				pst.setString(2, Time);
				pst.setString(3, name);
				
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
