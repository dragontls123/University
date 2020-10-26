package hw1;

import java.util.Scanner;

/**
 * a program that reads a line of text and then displays the line, but with the
 * first occurrence of hate changed to love
 * 
 * @since 2019.03.18
 * Email: dragontls123@gmail.com
 */
public class hw_p1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line of text");
		String input = s.nextLine();// read a line of text
		System.out.println("I have rephrased that line to read:");
		String replace=input.replaceFirst("hate", "love");//first occurence of hate changed to love
		System.out.println(replace);
	}
}
