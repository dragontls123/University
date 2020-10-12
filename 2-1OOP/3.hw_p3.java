package hw1;

import java.util.Scanner;

/**
 * a program that asks the user to enter a favorite color, a favorite food, a
 * favorite animal, and the first name of a friend or relative the program
 * should then print the two lines, with the user's input
 * 
 * @since 2019.03.18
 *Email: dragontls123@gmail.com
 */

public class hw_p3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your favorite color");
		String favoriteColor = s.nextLine();//enter your favorite color
		System.out.println("enter your favorite food");
		String favoriteFood = s.nextLine();//enter your favorite food
		System.out.println("enter your favorite animal");
		String favoriteAnimal = s.nextLine();//enter your favorite animal
		System.out.println("enter your name of friend or relative");
		String nameOfFriend = s.nextLine();//enter your name of friend or relative

		System.out.println("I had a dream that " + nameOfFriend + " ate a " + favoriteColor + " " + favoriteAnimal
				+ "\n" + "and said it tasted like " + favoriteFood + "!");
	}
}
