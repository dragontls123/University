/**
 * a program that read species' name, population, and growth rate.
 * Then calculate future population
 * 
 */

public class SpeciesFirstTryDemo {

	public static void main(String[] args) {
		SpeciesFirstTry speciesOfTheMonth = new SpeciesFirstTry();// create new SpeciesFirstTry
		System.out.println("Enter data on the Species of " + "the Month: ");
		speciesOfTheMonth.readInput();// call readInput method from SpeciseFirstTry
		speciesOfTheMonth.writeOutput();// call writeInput method from SpeciseFirstTry
		int futurePopulation = speciesOfTheMonth.getPopulationIn10();
		System.out.println("In ten years the population will be " + futurePopulation);
		// Change the species to show how to change
		// the values of instance variables:
		speciesOfTheMonth.name = "Klinggon ox";
		speciesOfTheMonth.population = 10;
		speciesOfTheMonth.growthRate = 15;
		System.out.println("The new Species of the Month : ");
		speciesOfTheMonth.writeOutput();
		System.out.println("In ten years the population will be " + speciesOfTheMonth.getPopulationIn10());
	}

}
