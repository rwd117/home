package sudo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocketChannel socketChannel = null; // 클라이언트 소켓 채널을 생성하고 초기화한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* 문자열울 입력받을 수 있는 BufferedReader 인스턴스 변수 br을 선언한다. */
		String str; // 전송할 메시지를 저장할 변수 str을 선언한다.
		try {
			socketChannel = SocketChannel.open(); // 클라이언트 소켓 채널을 오픈한다.
			socketChannel.configureBlocking(true); // 이 채널을 차단 모드로 둔다.
			System.out.println("연결 요청..");
			socketChannel.connect(new InetSocketAddress("localhost", 5001));
			/* 클라이언트 소켓 채널이 서버에서 설정한 포트 번호와 호스트 네임으로 서버 소켓 채널과 연결을 시도한다. */
			System.out.println("연결 성공!");

			ByteBuffer byteBuffer = null; // 바이트 버퍼를 초기화한다.
			Charset charset = Charset.forName("UTF-8");
			/* 문자열 세팅을 "UTF-8"로 설정한다. */

			while (true) { // 반복
				str = br.readLine(); // 상대 서버로 보낼 메시지를 입력한다.
				byteBuffer = charset.encode(str);
				/* 바이트 버퍼에 입력한 메시지를 인코딩한다. */
				socketChannel.write(byteBuffer);
				/* 클라이언트 소켓 채널에 바이트 버퍼를 써 보낸다. */
				System.out.println("송신:" + str);
				/* 보낸 메시지를 표시한다. */
				byteBuffer = ByteBuffer.allocate(100);
				/* 새로운 바이트 버퍼를 할당하고 초기화한다. */
				int byteCount = socketChannel.read(byteBuffer);
				/* 소켓 채널의 바이트 버퍼를 센다. */
				byteBuffer.flip(); // 버퍼가 초기화된다.

				String message = charset.decode(byteBuffer).toString();
				/*
				 * 상대 서버로부터 온 메시지를 저장할 변수다.상대로부터 온 바이트버퍼를 디코딩하여 문자열로 저장한다.
				 */
				System.out.println("수신:" + message);
				/* 수신 메시지를 표시한다. */
			}
		} catch (Exception e) {
		} // 예외 처리
		if (socketChannel.isOpen()) { // 채널 오픈 여부를 묻는다.
			try {
				socketChannel.close(); // 소켓 채널을 닫는다.
			} catch (IOException e1) {
			} // 예외 처리
		}
	}

}