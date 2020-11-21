import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> aList = new ArrayList<String>();
		System.out.println("Enter items for the list, when prompted");
		System.out.println("Type an entry:");
		String st = s.nextLine();
		aList.add(st);
		boolean t = true;
		while (t) {
			System.out.println("More item for the list?");
			switch (st) {
			case "yes":
				System.out.println("Type an entry:");
				aList.add(s.nextLine());
				break;
			case "No":
				for (int i = 0; i < aList.size(); i++)
					System.out.println(aList.get(i));
				t = false;
				break;
			}
		}
	}
}