import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.imageio.IIOException;

public class readCSV {
	public static void main(String[] args) {
		String filename = "Transactions.txt";
		Scanner f = null;
		try {
			f = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("erro");
			System.exit(0);
		}
		f.nextLine();
		while (f.hasNextLine()) {
			String[] result = f.nextLine().split(",");
			System.out.printf("sold %d of %s (SKU: %d) at $%.2f each\n", Integer.parseInt(result[1]), result[3],
					Integer.parseInt(result[0]), Double.parseDouble(result[2]));

		}
	}
}
