package hw1;

import java.util.Scanner;

/**
 * a program that determines the change to be dispensed from a vending machine
 * 
 * @since 2019.03.18 Email: dragontls123@gmail.com
 */
public class hw_p4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int priceOfItem;//price of item
		int quarter, dime, nickel;//quarter, dime, nickel
		System.out.println("Enter price of item");
		priceOfItem = s.nextInt();// enter price of item
		quarter = (100 - priceOfItem) / 25;
		dime = (100 - priceOfItem) % 25 / 10;
		nickel = (100 - priceOfItem) % 25%10/5;
		System.out.println("You bought an item for " + priceOfItem + " cents and gave me a dollar");
		System.out.println(
				"so your change is \n" + quarter + " quarters\n" + dime + " dimes, and\n" + nickel + " nickel.");
	}
}
