import java.io.*;
import java.net.*;

public class TCPClient1 {

	public static void main(String argv[]) throws Exception {
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		Socket socket = null;
		try {
			socket = new Socket("localhost",9999);// 클라이언트로부터 연결 요청 대기
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));//키보드로부터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String outputMessage;
			while (true) {
				outputMessage = stin.readLine();// 클라이언트에서 한 행의 문자열 읽음
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
				System.out.println("서버와 채팅 중 오류가 발생했습니다");
			}
		}
	}
}
