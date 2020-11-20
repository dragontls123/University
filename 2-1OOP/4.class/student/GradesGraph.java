
/**

File name: GradesGraph.java

Class for a GradesGraph.

An object of this class has these attributes
Number of each letter grade, A, B, C, D, and F.

Public methods:
Set the number of each grade individually or as a group.
Read the number of each grade individually or as a group.
Return the number of each grade.
Return the total number of grades.
Return the percent of each grade.
(a whole number from 0 to 100).
Display a graph of the number of each grade (by printing
a lines of asterisks proportional to number of grades).

Preconditions:
For set methods: the GradesGraph object has been created.
For read & return methods: values have been assigned to the
data members.

Postconditions:
Set methods: one or all grade counts have assigned a value.
Read methods: values displayed for one or all data members.
Graph method: lines of asterisks proportional to the number
of each grade are displayed.
*/

import java.util.*;

public class GradesGraph {
	private int Acount;
	private int Bcount;
	private int Ccount;
	private int Dcount;
	private int Fcount;
	private int asteriskCount;

	/**
	 * 
	 * Methods to set data members
	 * 
	 */
	public void readInput() // 데이터 입력
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("type number of 'A'");
		Acount = keyboard.nextInt();
		System.out.println("type number of 'B'");
		Bcount = keyboard.nextInt();
		System.out.println("type number of 'C'");
		Ccount = keyboard.nextInt();
		System.out.println("type number of 'D'");
		Dcount = keyboard.nextInt();
		System.out.println("type number of 'F'");
		Fcount = keyboard.nextInt();

		if ((Acount < 0) || (Bcount < 0) || (Ccount < 0) || (Dcount < 0) || (Fcount < 0)) {
			System.out.println("type valid number");

		}
	}

	public void writeOutput() {
		System.out.println("A: " + Acount);
		System.out.println("B: " + Bcount);
		System.out.println("C: " + Ccount);
		System.out.println("D: " + Dcount);
		System.out.println("F: " + Fcount);
	}

	public void writeAcount() // A 학생 수 출력
	{
		System.out.println("A: " + Acount);
	}

	public void writeBcount() // B 학생 수 출력
	{
		System.out.println("B: " + Bcount);
	}

	public void writeCcount() // C 학생 수 출력
	{
		System.out.println("C: " + Ccount);
	}

	public void writeDcount() // D 학생 수 출력
	{
		System.out.println("D: " + Dcount);
	}

	public void writeFcount() // F 학생 수 출력
	{
		System.out.println("F: " + Fcount);
	}

	public void set(int a, int b, int c, int d, int f) // 생성자
	{
		Acount = a;
		Bcount = b;
		Ccount = c;
		Dcount = d;
		Fcount = f;
	}

	public void setAcount(int a) // A 생성자
	{
		Acount = a;
	}

	public void setBcount(int b) // B 생성자
	{
		Bcount = b;
	}

	public void setCcount(int c) // C 생성자
	{
		Ccount = c;
	}

	public void setDcount(int d) // D 생성자
	{
		Dcount = d;
	}

	public void setFcount(int f) // F 생성자
	{
		Fcount = f;
	}

	public int getAcount() // A 접근자
	{
		return Acount;
	}

	public int getBcount() // B 접근자
	{
		return Bcount;
	}

	public int getCcount() // C 접근자
	{
		return Ccount;
	}

	public int getDcount() // D 접근자
	{
		return Dcount;
	}

	public int getFcount() // F 접근자
	{
		return Fcount;
	}

	/**
	 * 
	 * Method to return total number of grades
	 * 
	 */

	public int getTotalNumberOfGrades() {
		return (Acount + Bcount + Ccount + Dcount + Fcount);
	}

	/**
	 * 
	 * Method to return percentages of each grade
	 * 
	 */

	public int getPercentA() {
		return (int) ((float) Acount / this.getTotalNumberOfGrades() * 100 + 0.5);// rounding calculation
	}

	public int getPercentB() {
		return (int) ((float) Bcount / this.getTotalNumberOfGrades() * 100 + 0.5);// rounding calculation
	}

	public int getPercentC() {
		return (int) ((float) Ccount / this.getTotalNumberOfGrades() * 100 + 0.5);// rounding calculation
	}

	public int getPercentD() {
		return (int) ((float) Dcount / this.getTotalNumberOfGrades() * 100 + 0.5);// rounding calculation
	}

	public int getPercentF() {
		return (int) ((float) Fcount / this.getTotalNumberOfGrades() * 100 + 0.5);// rounding calculation
	}

	/**
	 * 
	 * Method to graph grade counts by printing lines of asterisks
	 * 
	 */

	public void draw() {
		// Draw scale
		System.out.println("2   10   20   30   40   50" + "   60   70   80   90   100");
		System.out.println("|   |    |    |    |    |" + "    |    |    |    |    |");
		System.out.println("*************************" + "*************************");

		// Print row for each grade, from A to F
		// Each asterisk is 2%, so the number of asterisks
		// to print is the percent of a grade divided by 2.
		// (since the fractional part is either 0
		// or 0.5, just truncate)
		System.out.println("A:"); // A 그래프 출력
		for (asteriskCount = 1; asteriskCount <= (getPercentA()) / 2; asteriskCount++) {
			System.out.print("*");
			if (asteriskCount % 5 == 0) {
				System.out.print("|");
			}
		}

		System.out.println();
		System.out.println("B:"); // B 그래프 출력
		for (asteriskCount = 1; asteriskCount <= (getPercentB()) / 2; asteriskCount++) {
			System.out.print("*");
			if (asteriskCount % 5 == 0) {
				System.out.print("|");
			}
		}

		System.out.println();
		System.out.println("C:"); // C 그래프 출력
		for (asteriskCount = 1; asteriskCount <= (getPercentC()) / 2; asteriskCount++) {
			System.out.print("*");
			if (asteriskCount % 5 == 0) {
				System.out.print("|");
			}
		}

		System.out.println();
		System.out.println("D:"); // D그래프 출력
		for (asteriskCount = 1; asteriskCount <= (getPercentD()) / 2; asteriskCount++) {
			System.out.print("*");
			if (asteriskCount % 5 == 0) {
				System.out.print("|");
			}
		}

		System.out.println();
		System.out.println("F:"); // F 그래프 출력
		for (asteriskCount = 1; asteriskCount <= (getPercentF()) / 2; asteriskCount++) {
			System.out.print("*");
			if (asteriskCount % 5 == 0) {
				System.out.print("|");
			}
		}

	}

}
