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
		SocketChannel socketChannel = null; // Ŭ���̾�Ʈ ���� ä���� �����ϰ� �ʱ�ȭ�Ѵ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* ���ڿ��� �Է¹��� �� �ִ� BufferedReader �ν��Ͻ� ���� br�� �����Ѵ�. */
		String str; // ������ �޽����� ������ ���� str�� �����Ѵ�.
		try {
			socketChannel = SocketChannel.open(); // Ŭ���̾�Ʈ ���� ä���� �����Ѵ�.
			socketChannel.configureBlocking(true); // �� ä���� ���� ���� �д�.
			System.out.println("���� ��û..");
			socketChannel.connect(new InetSocketAddress("localhost", 5001));
			/* Ŭ���̾�Ʈ ���� ä���� �������� ������ ��Ʈ ��ȣ�� ȣ��Ʈ �������� ���� ���� ä�ΰ� ������ �õ��Ѵ�. */
			System.out.println("���� ����!");

			ByteBuffer byteBuffer = null; // ����Ʈ ���۸� �ʱ�ȭ�Ѵ�.
			Charset charset = Charset.forName("UTF-8");
			/* ���ڿ� ������ "UTF-8"�� �����Ѵ�. */

			while (true) { // �ݺ�
				str = br.readLine(); // ��� ������ ���� �޽����� �Է��Ѵ�.
				byteBuffer = charset.encode(str);
				/* ����Ʈ ���ۿ� �Է��� �޽����� ���ڵ��Ѵ�. */
				socketChannel.write(byteBuffer);
				/* Ŭ���̾�Ʈ ���� ä�ο� ����Ʈ ���۸� �� ������. */
				System.out.println("�۽�:" + str);
				/* ���� �޽����� ǥ���Ѵ�. */
				byteBuffer = ByteBuffer.allocate(100);
				/* ���ο� ����Ʈ ���۸� �Ҵ��ϰ� �ʱ�ȭ�Ѵ�. */
				int byteCount = socketChannel.read(byteBuffer);
				/* ���� ä���� ����Ʈ ���۸� ����. */
				byteBuffer.flip(); // ���۰� �ʱ�ȭ�ȴ�.

				String message = charset.decode(byteBuffer).toString();
				/*
				 * ��� �����κ��� �� �޽����� ������ ������.���κ��� �� ����Ʈ���۸� ���ڵ��Ͽ� ���ڿ��� �����Ѵ�.
				 */
				System.out.println("����:" + message);
				/* ���� �޽����� ǥ���Ѵ�. */
			}
		} catch (Exception e) {
		} // ���� ó��
		if (socketChannel.isOpen()) { // ä�� ���� ���θ� ���´�.
			try {
				socketChannel.close(); // ���� ä���� �ݴ´�.
			} catch (IOException e1) {
			} // ���� ó��
		}
	}

}