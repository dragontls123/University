import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {
	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader("src.txt"));
			outputStream = new PrintWriter(new FileWriter("dest.txt"));
			String l;
			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
				System.out.println("inputstream close");// to show end of project
			}
			if (outputStream != null) {
				outputStream.close();
				System.out.println("outputstream close");// to show end of project
			}
		}
	}
}