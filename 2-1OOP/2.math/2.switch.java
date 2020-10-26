import java.util.Scanner;
enum movie {a,b,c}
public class switch{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char input = s.next().charAt(0);
		double gradeValue;
		switch (input) {
		case 'A':
			gradeValue = 4.0;
			break;
		case 'B':
			gradeValue = 3.0;
			break;
		case 'C':
			gradeValue = 2.0;
			break;
		case 'D':
			gradeValue = 1.0;
			break;

		default:
			gradeValue = 0;
			break;
		}
		System.out.println(gradeValue);
	}
}
