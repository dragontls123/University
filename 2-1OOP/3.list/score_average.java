import java.util.Scanner;

public class score_average {
	public static void main(String[] args) {

		int[] score = new int[5];
		Scanner keyboard = new Scanner(System.in);
		int scoreSum = 0;
		for (int i = 0; i < 5; i++) {
			score[i] = keyboard.nextInt();
			scoreSum += score[i];
		}
		double average = (double) scoreSum / 5;
		System.out.println("Average score: " + average);
		for (int i = 0; i < 5; i++) {
			if (score[i] > average)
				System.out.println(score[i] + ": above average");
			else if (score[i] < average)
				System.out.println(score[i] + ": below average");
			else
				System.out.println(score[i] + ": equal to the average");
		}
	}
}