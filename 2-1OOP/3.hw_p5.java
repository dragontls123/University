package hw1;

import java.util.Scanner;

/**
 * a program that read a 4-bit binary number from the keyboard as a string and
 * then converts it into decimal
 * 
 * @since 2019.03.18 Email: dragontls123@gmail.com
 */
public class hw_p5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String binaryNumber = s.nextLine();// read binary number
		int b0 = 8 * Integer.parseInt(binaryNumber.substring(0, 1));
		int b1 = 4 * Integer.parseInt(binaryNumber.substring(1, 2));
		int b2 = 2 * Integer.parseInt(binaryNumber.substring(2, 3));
		int b3 = Integer.parseInt(binaryNumber.substring(3, 4));
		System.out.println("binary number " + binaryNumber + "=" + (b0 + b1 + b2 + b3) + " in decimal");
	}
}
