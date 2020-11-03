import java.io.*;
import java.net.*;

public class TCPClient1 {

	public static void main(String argv[]) throws Exception {
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		Socket socket = null;
		try {
			socket = new Socket("localhost",9999);// Ŭ���̾�Ʈ�κ��� ���� ��û ���
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));//Ű����κ���
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String outputMessage;
			while (true) {
				outputMessage = stin.readLine();// Ŭ���̾�Ʈ���� �� ���� ���ڿ� ����
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage);
					out.flush();
					break;
				}
				out.write("client>"+outputMessage+"\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println(inputMessage);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
				
			} catch (IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�");
			}
		}
	}
}
