import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileInputDemo {
	public static void main(String[] args) {
		String filename = "data.txt";
		Scanner inputstream = null;
		System.out.println("the file name is " + filename + "\ncontains the following lines:\n ");
		try {
			inputstream = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("error");
			System.exit(0);
		}
		while (inputstream.hasNextLine()) {
			String line = inputstream.nextLine();
			System.out.println(line);
		}
	}
}
