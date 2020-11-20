import java.util.Scanner;

public class ArrayOfTemperature {
	public static void main(String[] args) {
// Read temperatures and compute their average:
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many temperatures do you have?");
		int size = keyboard.nextInt();
		double[] temperature = new double[size];
		System.out.println("Enter " + size + " temperatures:");
		double sum = 0;
		for (int index = 0; index < temperature.length; index++) {
			temperature[index] = keyboard.nextDouble();
			sum += temperature[index];
		}
		double average = sum / size;
		System.out.println("The average temperature is " + average);
// Display each temperature and its relation to the average:
		System.out.println("The temperatures are");
		for (int index = 0; index < temperature.length; index++) {
			System.out.println(temperature[index] + (temperature[index] == average ? " is average"
					: (temperature[index] >= average ? " above average" : " below average")));
		}
		System.out.println("Have a nice week.");
	}
}