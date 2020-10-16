package hw1;

import java.util.Scanner;

/**
 * a program that will read a line of text as input and then display the line
 * with the first word moved to the end of the line
 * 
 * @since 2019.03.18 Email: dragontls123@gmail.com
 */

public class hw_p2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line of text. No punctuation please");
		String input = s.nextLine();// read a line of text
		int t = input.indexOf(" ");// find index of blank
		String substringBeforeBlank = input.substring(0, t);// substring before blank
		String substringAfterBlank = input.substring(t + 1);// substring after blank
		String toUpper = substringAfterBlank.substring(0, 1).toUpperCase();// uppercase of first index of
																			// substringAfterBlank
		System.out.println("I have rephrased that line to read");
		System.out.println(toUpper + substringAfterBlank.substring(1) + " " + substringBeforeBlank);// line with the
																									// first word moved
																									// to the
																									// end of the line
	}
}
