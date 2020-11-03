import java.io.*;
import java.net.*;

public class TCPServer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		try {
			listener = new ServerSocket(9999);// ���� ���� ����
			socket = listener.accept();// Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("�����");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String inputMessage;
			while (true) {
				inputMessage = in.readLine();// Ŭ���̾�Ʈ���� �� ���� ���ڿ� ����
				if (inputMessage.equalsIgnoreCase("bye"))
					break;
				System.out.println(inputMessage);
				String outputMessage = stin.readLine();
				out.write("server>" + outputMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
				listener.close();

			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�");
			}
		}
	}
}