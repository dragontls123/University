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
			listener = new ServerSocket(9999);// 서버 소켓 생성
			socket = listener.accept();// 클라이언트로부터 연결 요청 대기
			System.out.println("연결됨");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String inputMessage;
			while (true) {
				inputMessage = in.readLine();// 클라이언트에서 한 행의 문자열 읽음
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
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다");
			}
		}
	}
}