import java.util.Scanner;
public class SpeciesFirstTry 
{
	public String name;
	public int population;
	public double growthRate;
	
	public void readInput()//method for reading input of name, population and growthRate
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the species' name?");
		name = keyboard.nextLine();//read name
		System.out.println("What is the population of the " + "species?");
		population = keyboard.nextInt();//read population
		System.out.println("Enter growth rate " + "(% increase per year):");
		growthRate = keyboard.nextDouble();//read growthRate
	}
	public void writeOutput()//method for writing input of name, population and growthRate
	{
		System.out.println("Name = " + name);
		System.out.println("Population = " + population);
		System.out.println("Growth rate = " + growthRate + "%");
	}
	public int getPopulationIn10()//method for getting result of populationAmount for getting population after 10 years
	{
		int result = 0;
		double populationAmount = population;//get population into populationAmount as double type
		int count = 10;//multiple 10 times 
		while ((count > 0) && (populationAmount > 0))
		{
			populationAmount = populationAmount + (growthRate / 100) * populationAmount;
			count --;
		}
		if(populationAmount > 0)
			result = (int)populationAmount;
		return result;
	}

}
