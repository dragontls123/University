import java.util.Scanner;

public class displayAsWord {

	public static void displayAsWords(int numeral) {
		if (numeral < 10)
			System.out.print(getWordFromDigit(numeral) + " ");
		else // numeral has two or more digits
		{
			displayAsWords(numeral / 10);
			System.out.print(getWordFromDigit(numeral % 10) + " ");
		}
	}

	private static String getWordFromDigit(int numeral) {
		// TODO Auto-generated method stub
		String[] dict = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		return dict[numeral];
	}

	public static void main(String[] args) {
		System.out.println("Enter an integer:");
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		System.out.println("The digits in that number are:");
		displayAsWords(d);
		System.out.println();
		System.out.println("If you add ten to that number are:");
		displayAsWords(d+10);
	}
}
