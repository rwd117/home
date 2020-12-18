package sudo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EchoServer {
	public static Connection makeConnection() {
		/* makeConnection() �޼ҵ带 �����Ѵ�. */
		String url = "jdbc:mysql://localhost:3306/condb";
		/* ȣ��Ʈ, ��Ʈ �ּҸ� ���ڿ� ���� url�� ���´� */
		Connection con = null;
		/* Connection ���� con�� �ʱ�ȭ�Ѵ�. */
		try {/* try ~ catch ���� Ŭ�������� ����ϴ� ���� �� ����ó�� ����̴�. */
			Class.forName("com.mysql.jdbc.Driver");
			/*
			 * Class Ŭ������ �ν��Ͻ��� �������� �ڹ� ���� ���α׷��� Ŭ������ �������̽��� ��Ÿ��. ������ ĳ���� ���� ����
			 * ������ Ŭ���� �Ǵ� �������̽��� ���� ���� �� �־��� Class ������Ʈ�� �����ش�. ���⼭�� mysql ����̹���
			 * �ҷ��´�.
			 */
			System.out.println("MySQL client ������ ���̽� ���� �����..");
			/* �����ͺ��̽� ���� �ȳ� �޽��� */
			con = DriverManager.getConnection(url, "root", "1234");
			/*
			 * ������ �����ͺ��̽� URL�� ���� ������ �õ���. �ּ�, ����� �̸�, ����� ��й�ȣ. DriveManager��
			 * ��� �� JDBC ����̹� ��Ʈ���� ������ ����̹��� �����Ϸ��� �õ���.
			 */
			System.out.println("MySQL client ������ ���̽� ���� ����.");
			/* �����ͺ��̽� ���� �ȳ� �޽���. */

		} catch (ClassNotFoundException e) {
			/* ������ �̸��� ���� Ŭ������ ���� ���Ǹ� ã�� �� ���� ��� ����ó�� */
			System.out.println("JDBC ����̹��� ã�� ���߽��ϴ�.");
			/* ����̹� Ž�� ���� �ȳ� �޽��� */
		} catch (SQLException e) {
			/* ������ ���̽� ���� ���� �� ��Ÿ ������ ���� ���� ó�� */
			System.out.println("�����ͺ��̽� ���� ����");
			/* ������ ���̽� ���� ���� �ȳ� �޽���. */
		}
		return con;
		/* con ���� ��ȯ */
	}

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ServerSocketChannel serverSocketChannel = null; // ���� ���� ä���� �����ϰ� �ʱ�ȭ�Ѵ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* ���ڿ��� �Է¹��� �� �ִ� BufferedReader Ŭ������ �ν��Ͻ� ���� br�� �����Ѵ�. */
		String str; // �Է¹��� ���ڸ� ������ ���� str�� �����Ѵ�.
		try {
			serverSocketChannel = ServerSocketChannel.open(); // ���� ���� ä���� �����Ѵ�.
			serverSocketChannel.configureBlocking(true); // ä���� ���� ��� ���·� �д�.
			serverSocketChannel.bind(new InetSocketAddress(5001));
			/* ���� ������ ��Ʈ �ѹ��� '5001'�� �ϰ� ����� �����ϰԲ� ���� ä�η� ���´�. */
			while (true) { // �ݺ�
				System.out.println("���� �����..");
				SocketChannel socketChannel = serverSocketChannel.accept();
				/*
				 * ���� ä�ο� ���� ���� ä���� �ִ´�. ä���� ���Ͽ� ���� ������ �����ϳ� Ŭ���̾�Ʈ�� ���� �������� ���ŷ
				 * ���¸� �����Ѵ�.
				 */
				InetSocketAddress isa = (InetSocketAddress) socketChannel.getRemoteAddress();
				/*
				 * InetSocketAddress Ŭ���� ���� isa�� �����Ѵ�. �� ä���� ������ ���ӵǰ� �ִ� ����Ʈ �ּҸ�
				 * �����ش�.
				 */
				System.out.println("���� ����." + isa.getHostName());
				/* Ŭ���̾�Ʈ�� ������ �����Ǹ� isa�� ������ ip �ּҸ� ����Ѵ�. */

				ByteBuffer byteBuffer = null;
				/*
				 * ByteBuffer ������ �����Ѵ�. ��� ���۷κ��� ���� ���ڿ��� �迭�� �����Ͽ� �����ϴ� �ϰ� ó��
				 * �޼ҵ��. ����Ʈ �迭 �ۼ����� ���������� �� �� �ִ�.
				 */
				Charset charset = Charset.forName("UTF-8");
				/* ���� ������ "UTF-8"�� �Ѵ�. */

				while (true) {
					byteBuffer = ByteBuffer.allocate(100);
					/* ���ο� ����Ʈ ���۸� �Ҵ��ϰ� �ʱ�ȭ�Ѵ�. */
					int byteCount = socketChannel.read(byteBuffer);
					/* ����ä���� ����Ʈ ���۸� ����. */
					byteBuffer.flip(); // ���۰� �ʱ�ȭ�ȴ�.
					String message = charset.decode(byteBuffer).toString();
					/*
					 * ��� Ŭ���̾�Ʈ�κ��� �� �޽����� ������ ������.���κ��� �� ����Ʈ���۸� ���ڵ��Ͽ� ���ڿ���
					 * �����Ѵ�.
					 */
					System.out.println("����:" + message);
					/* ��� Ŭ���̾�Ʈ�� ���� �޽����� ����Ѵ�. */
					String sql = "insert into client(message, date) values" + "(" + "'" + message + "'" + "," + "now()"
							+ ");";
					if (stmt.executeUpdate(sql) == 1)
						System.out.println("Add to Record complete");
					else
						System.out.println("Add to Record Fail");
					str = br.readLine(); // ��뿡�� ���� �޽����� �Է��Ѵ�.
					byteBuffer = charset.encode(str);
					/* ����Ʈ ���ۿ� �Է��� ���ڿ��� �����Ͽ� ���ڵ��Ѵ�. */
					socketChannel.write(byteBuffer);
					/* ���� ä�ο� ����Ʈ ���۸� ���� �����Ѵ�. */
					System.out.println("�۽�:" + str);
					sql = "insert into client(message, date) values" + "(" + "'" + str + "'" + "," + "now()" + ");";
					if (stmt.executeUpdate(sql) == 1)
						System.out.println("Add to Record complete");
					else
						System.out.println("Add to Record Fail");
				}
			}
		} catch (Exception e) {
		} // ���� ó��

		if (serverSocketChannel.isOpen()) { // ä�� ���� ���θ� ���´�.
			try {
				serverSocketChannel.close(); // ���� ä���� �ݴ´�.
				con.close();
				stmt.close();
			} catch (IOException e1) {
			}
		}
	}

}