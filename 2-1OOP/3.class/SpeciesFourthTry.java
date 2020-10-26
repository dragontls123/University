import java.util.Scanner;

/**
 * a class is used in the program SpeciesFourthTryDemo
 * 
 *
 */
public class SpeciesFourthTry {
	private String name;
	private int population;
	private double growthRate;

	public void readInput()// method for reading input of name, population and growthRate
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the species' name?");
		name = keyboard.nextLine();// read name
		System.out.println("What is the population of the " + "species?");
		population = keyboard.nextInt();// read population
		System.out.println("Enter growth rate " + "(% increase per year):");
		growthRate = keyboard.nextDouble();// read growthRate
	}

	public void writeOutput()// method for writing input of name, population and growthRate
	{
		System.out.println("Name = " + name);
		System.out.println("Population = " + population);
		System.out.println("Growth rate = " + growthRate + "%");
	}

	/**
	 * Returns the projected population of the receiving object after the specified
	 * number of years.
	 */
	public int predictPopulation(int years) {
		int result = 0;
		double populationAmount = population;
		int count = years;
		while ((count > 0) && (populationAmount > 0)) {
			populationAmount = (populationAmount + (growthRate / 100) * populationAmount);
			count--;
		}
		if (populationAmount > 0)
			result = (int) populationAmount;
		return result;
	}

	public void setSpecies(String newName, int newPopulation, double newGrowthRate)// mutator to set name, population,
																					// and growth rate
	{
		name = newName;// set name
		if (newPopulation >= 0)// check population variable is set properly
			population = newPopulation;// set population
		else {
			System.out.println("ERROR: using a negative population.");
			System.exit(0);
		}
		growthRate = newGrowthRate;// set growth rate
	}

	public String getName()// accessor for name
	{
		return name;
	}

	public int getPopulation()// accessor for population
	{
		return population;
	}

	public double getGrowthRate()// accessor for growth rate
	{
		return growthRate;
	}

}
