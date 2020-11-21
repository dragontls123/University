import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Scanner;

public class textFileInputViaKeyboard {
	public static void main(String[] args) {
		String input;
		String filename = "src.txt";
		Scanner s = new Scanner(System.in);
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			System.exit(0);
		}
		System.out.println("enter three line of text:");
		for (int i = 1; i <= 3; i++) {
			input = s.nextLine();
			outputStream.println(i + " " + input);
		}
		System.out.println("those lines were written to " + filename);
		outputStream.close();
	}
}
