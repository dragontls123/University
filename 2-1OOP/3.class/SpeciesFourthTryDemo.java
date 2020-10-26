import java.util.Scanner;

/**
 * Demonstrates the use of the mutator method setSpecies.
 */
public class SpeciesFourthTryDemo {
	public static void main(String[] args) {
		SpeciesFourthTry speciesOfTheMonth = new SpeciesFourthTry();// create new SpeciesFourthTry
		System.out.println("Enter number of years to project:");
		Scanner keyboard = new Scanner(System.in);
		int numberOfYears = keyboard.nextInt();//read number of years

		System.out.println("Enter data on the Species of the Month:");
		speciesOfTheMonth.readInput();// call readInput method from SpeciseFirstTry
		speciesOfTheMonth.writeOutput();// call writeOutput method from SpeciseFirstTry

		int futurePopulation = speciesOfTheMonth.predictPopulation(numberOfYears);
		System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);
		// Change the species to show how to change
		// the values of instance variables:
		speciesOfTheMonth.setSpecies("Klingon ox", 10, 15);//set name, population, and growth rate using mutator
		System.out.println("The new Species of the Month:");
		speciesOfTheMonth.writeOutput();

		futurePopulation = speciesOfTheMonth.predictPopulation(numberOfYears);
		System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);

	}

}
