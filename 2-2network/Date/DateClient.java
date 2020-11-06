import java.util.Scanner;
import java.net.Socket;
import java.io.IOException;

public class DateClient {
	public static void main(String[] args) throws IOException {
		var socket = new Socket("localhost", 59090);
		var in = new Scanner(socket.getInputStream());
		System.out.println("Server response: " + in.nextLine());
	}
}