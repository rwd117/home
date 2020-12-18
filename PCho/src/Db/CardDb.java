package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CardDb {
	
	public static ArrayList<String> CardNumDb(String Card[]) {
		//ī�� ���� �о ��� ���̸� �����ϱ� ���� db
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

			sql = "select c_state from Pcca where c_code=?";

			pst = con.prepareStatement(sql);

			for (int i = 1; i < Card.length; i++) {

				pst.setInt(1, Integer.parseInt(Card[i]));

				rs = pst.executeQuery();

				while (rs.next()) {
					no = rs.getString("c_state");
				}
				
				if (no.equals("��� ��")) {
					no1.add(Card[i]);
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

	public static int Cardadd(String Card) {
		//�α� �ƿ��� ������ ���̽� ī�� ��� �������� ����
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

			sql = "update PCca set c_state=? where c_code=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, "��� ����");
			pst.setInt(2, Integer.parseInt(Card));

			rs = pst.executeUpdate();

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

	public static int Cardsub(String Card) {
		//�α��ν� �ش� ī���ȣ ��� ������ ��ȯ
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
			
			sql = "update PCca set c_state=? where c_code=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, "��� ��");
			pst.setInt(2, Integer.parseInt(Card));
			
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
