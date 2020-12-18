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
		/* makeConnection() 메소드를 선언한다. */
		String url = "jdbc:mysql://localhost:3306/condb";
		/* 호스트, 포트 주소를 문자열 변수 url로 묶는다 */
		Connection con = null;
		/* Connection 변수 con을 초기화한다. */
		try {/* try ~ catch 문은 클래스에서 사용하는 조건 및 예외처리 명령이다. */
			Class.forName("com.mysql.jdbc.Driver");
			/*
			 * Class 클래스의 인스턴스는 실행중인 자바 응용 프로그램의 클래스와 인터페이스를 나타냄. 지정된 캐릭터 라인 명을
			 * 가지는 클래스 또는 인터페이스에 관련 지을 수 있었던 Class 오브젝트를 돌려준다. 여기서는 mysql 드라이버를
			 * 불러온다.
			 */
			System.out.println("MySQL client 데이터 베이스 연결 대기중..");
			/* 데이터베이스 연결 안내 메시지 */
			con = DriverManager.getConnection(url, "root", "1234");
			/*
			 * 지정된 데이터베이스 URL에 대한 연결을 시도함. 주소, 사용자 이름, 사용자 비밀번호. DriveManager는
			 * 등록 된 JDBC 드라이버 세트에서 적절한 드라이버를 선택하려고 시도함.
			 */
			System.out.println("MySQL client 데이터 베이스 연결 성공.");
			/* 데이터베이스 성공 안내 메시지. */

		} catch (ClassNotFoundException e) {
			/* 지정된 이름을 가진 클래스에 대한 정의를 찾을 수 없을 경우 예외처리 */
			System.out.println("JDBC 드라이버를 찾지 못했습니다.");
			/* 드라이버 탐색 실패 안내 메시지 */
		} catch (SQLException e) {
			/* 데이터 베이스 접근 오류 및 기타 오류에 대한 예외 처리 */
			System.out.println("데이터베이스 연결 실패");
			/* 데이터 베이스 접근 실패 안내 메시지. */
		}
		return con;
		/* con 변수 반환 */
	}

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ServerSocketChannel serverSocketChannel = null; // 서버 소켓 채널을 생성하고 초기화한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* 문자열을 입력받을 수 있는 BufferedReader 클래스의 인스턴스 변수 br을 선언한다. */
		String str; // 입력받은 문자를 저장할 변수 str을 선언한다.
		try {
			serverSocketChannel = ServerSocketChannel.open(); // 서버 소켓 채널을 오픈한다.
			serverSocketChannel.configureBlocking(true); // 채널을 차단 모드 상태로 둔다.
			serverSocketChannel.bind(new InetSocketAddress(5001));
			/* 서버 소켓의 포트 넘버를 '5001'로 하고 통신이 가능하게끔 소켓 채널로 묶는다. */
			while (true) { // 반복
				System.out.println("연결 대기중..");
				SocketChannel socketChannel = serverSocketChannel.accept();
				/*
				 * 소켓 채널에 서버 소켓 채널을 넣는다. 채널의 소켓에 대한 연결을 수락하나 클라이언트와 연결 전까지는 블로킹
				 * 상태를 유지한다.
				 */
				InetSocketAddress isa = (InetSocketAddress) socketChannel.getRemoteAddress();
				/*
				 * InetSocketAddress 클래스 변수 isa를 선언한다. 이 채널의 소켓이 접속되고 있는 리모트 주소를
				 * 돌려준다.
				 */
				System.out.println("연결 수락." + isa.getHostName());
				/* 클라이언트와 연결이 수락되면 isa에 대입한 ip 주소를 출력한다. */

				ByteBuffer byteBuffer = null;
				/*
				 * ByteBuffer 변수를 선언한다. 상대 버퍼로부터 받은 문자열을 배열에 대입하여 전송하는 일괄 처리
				 * 메소드다. 바이트 배열 송수신을 연속적으로 할 수 있다.
				 */
				Charset charset = Charset.forName("UTF-8");
				/* 문자 세팅을 "UTF-8"로 한다. */

				while (true) {
					byteBuffer = ByteBuffer.allocate(100);
					/* 새로운 바이트 버퍼를 할당하고 초기화한다. */
					int byteCount = socketChannel.read(byteBuffer);
					/* 소켓채널의 바이트 버퍼를 센다. */
					byteBuffer.flip(); // 버퍼가 초기화된다.
					String message = charset.decode(byteBuffer).toString();
					/*
					 * 상대 클라이언트로부터 온 메시지를 저장할 변수다.상대로부터 온 바이트버퍼를 디코딩하여 문자열로
					 * 저장한다.
					 */
					System.out.println("수신:" + message);
					/* 상대 클라이언트가 보낸 메시지를 출력한다. */
					String sql = "insert into client(message, date) values" + "(" + "'" + message + "'" + "," + "now()"
							+ ");";
					if (stmt.executeUpdate(sql) == 1)
						System.out.println("Add to Record complete");
					else
						System.out.println("Add to Record Fail");
					str = br.readLine(); // 상대에게 보낼 메시지를 입력한다.
					byteBuffer = charset.encode(str);
					/* 바이트 버퍼에 입력한 문자열을 대입하여 인코딩한다. */
					socketChannel.write(byteBuffer);
					/* 소켈 채널에 바이트 버퍼를 쓰고 전송한다. */
					System.out.println("송신:" + str);
					sql = "insert into client(message, date) values" + "(" + "'" + str + "'" + "," + "now()" + ");";
					if (stmt.executeUpdate(sql) == 1)
						System.out.println("Add to Record complete");
					else
						System.out.println("Add to Record Fail");
				}
			}
		} catch (Exception e) {
		} // 예외 처리

		if (serverSocketChannel.isOpen()) { // 채널 오픈 여부를 묻는다.
			try {
				serverSocketChannel.close(); // 소켓 채널을 닫는다.
				con.close();
				stmt.close();
			} catch (IOException e1) {
			}
		}
	}

}