import java.util.Scanner;

public class random{
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the starting number of the range: ");
		int startNum = keyboard.nextInt();
		System.out.print("Input the ending number of the range: ");
		int endNum = keyboard.nextInt();
		int random_num = startNum + (int) (Math.random() * ((endNum - startNum) + 1));
		System.out.println(random_num);
	}
}