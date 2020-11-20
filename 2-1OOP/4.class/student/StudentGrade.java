
/**

 Class StudentGrade: for a Student's grade.

 This class stores one student's record for a course:
   Student's name
   Score on quiz 1 (0 to 10 points, 1/2 of 25% of final grade)
   Score on quiz 1 (0 to 10 points, 1/2 of 25% of final grade)
   Score on midterm exam (0 to 100 points, 25% of final grade)
   Score on final exam (0 to 100 points, 50% of final grade)

 This class includes the following public methods:
   Request and read input data.
   Display all input data.
   Request and read just the student's name.
   Display the student's name.
   Return the student's name.
   Request and read just quiz 2 score.
   Display quiz 2 score.
   Return quiz 2 score.
   Request and read just midterm score.
   Display midterm score.
   Return midterm score.
   Request and read just the final exam score.
   Display final exam score.
   Return final exam score.
   Calculate, set and return final grade as a percent.
   Display final grade as a percent (must be set 1st).
   Calculate, set and return final grade as a letter (A,B,C,D, or F).
   Display final grade as a letter (must be set 1st).
*/
import java.util.*;

public class StudentGrade {
	// input values
	private String name;
	private int quiz1;
	private int quiz2;
	private int midterm;
	private int finalExam;

	// calculated values
	private int percentGrade;
	private char letterGrade;

	// A new keyboard object is created in each method that uses it.
	// Otherwise there would be problems with nextLine, as described
	// in the Gotcha in Chapter 2.

	private Scanner keyboard;

	/**
	 * Reads student's name and scores for the two quizzes, midterm, and final exam.
	 * 
	 * Postcondition: quiz 1 and 2 scores are values between 0 and 10. midterm and
	 * final exam scores are values between 0 and 100.
	 */
	public void readRecord() {
		keyboard = new Scanner(System.in);

		System.out.println("What is the student's name?");
		name = keyboard.nextLine();

		System.out.println("Quiz 1 score (out of 10 points)?");
		quiz1 = keyboard.nextInt();
		while (quiz1 < 0 || quiz1 > 10) {
			System.out.println("Sorry, but -");
			System.out.println("Quiz 1 score must be between 0 and 10 -");
			System.out.println("Please enter a valid Quiz 1 score: ");
			quiz1 = keyboard.nextInt();
		}

		System.out.println("Quiz 2 score (out of 10 points)?");
		quiz2 = keyboard.nextInt();
		while (quiz2 < 0 || quiz2 > 10) {
			System.out.println("Sorry, but -");
			System.out.println("Quiz 2 score must be between 0 and 10 -");
			System.out.println("Please enter a valid Quiz 2 score: ");
			quiz2 = keyboard.nextInt();
		}

		System.out.println("Midterm score (out of 100 points)?");
		midterm = keyboard.nextInt();
		while (midterm < 0 || midterm > 100) {
			System.out.println("Sorry, but -");
			System.out.println("Midterm score must be between 0 and 100");
			System.out.println("Please enter a valid midterm score: ");
			midterm = keyboard.nextInt();
		}

		System.out.println("Final Exam score (out of 100 points)?");
		finalExam = keyboard.nextInt();
		while (finalExam < 0 || finalExam > 100) {
			System.out.println("Sorry, but -");
			System.out.println("Final exam score must be 0 to 100");
			System.out.println("Please enter a valid final exam score: ");
			finalExam = keyboard.nextInt();
		}
	}

	/**
	 * Prints student's name and scores for the two quizzes, midterm, and final
	 * exam.
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public void writeRecord() {
		System.out.println("Name = " + name);
		System.out.println("Quiz 1 score (out of 10 pts) = " + quiz1);
		System.out.println("Quiz 2 score (out of 10 pts) = " + quiz2);
		System.out.println("Midterm score (out of 100 pts) = " + midterm);
		System.out.println("Final exam score (out of 100 pts) = " + finalExam);
	}

	/**
	 * Reads and assigns just the student's name.
	 * 
	 * Postcondition: only the student's name has been set or changed.
	 * 
	 */
	public void readName() {
		keyboard = new Scanner(System.in);

		System.out.println("What is the student's name?");
		name = keyboard.nextLine();

	}

	/**
	 * Prints student's name.
	 * 
	 * Precondition: The student's name has been entered.
	 * 
	 */
	public void writeName() {
		System.out.println("Name = " + name);
	}

	/**
	 * Returns student's name as a String type.
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public String returnName() {
		return name;

	}

	/**
	 * Reads and assigns just the score for quiz 1.
	 * 
	 * Postcondition: only the student's quiz 1 score has been set or changed.
	 * 
	 */
	public void readQuiz1() {
		keyboard = new Scanner(System.in);
		System.out.println("Quiz 1 score (out of 10 points)?");
		quiz1 = keyboard.nextInt();
		while ((quiz1 < 0) || (quiz1 > 10)) {
			System.out.println("Sorry, but -");
			System.out.println("Quiz 1 score must be between 0 and 10 -");
			System.out.println("Please enter a valid Quiz 1 score: ");
			quiz1 = keyboard.nextInt();
		}
	}

	/**
	 * Prints student's score for quiz 1.
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public void writeQuiz1() {
		System.out.println("Quiz 1 score (out of 10 pts) = " + quiz1);
	}

	/**
	 * Returns student's score for quiz 1 (an integer from 0 to 10).
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public int returnQuiz1() {
		return quiz1;

	}

	/**
	 * Reads and assigns just the score for quiz 2.
	 * 
	 * Postcondition: only the student's quiz 2 score has been set or changed.
	 * 
	 */
	public void readQuiz2() {
		keyboard = new Scanner(System.in);
		System.out.println("Quiz 2 score (out of 10 points)?");
		quiz2 = keyboard.nextInt();
		while ((quiz2 < 0) || (quiz2 > 10)) {
			System.out.println("Sorry, but -");
			System.out.println("Quiz 2 score must be between 0 and 10 -");
			System.out.println("Please enter a valid Quiz 2 score: ");
			quiz2 = keyboard.nextInt();
		}
	}

	/**
	 * Prints student's score for quiz 2.
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public void writeQuiz2() {
		System.out.println("Quiz 2 score (out of 10 pts) = " + quiz2);
	}

	/**
	 * Returns student's score for quiz 2 (an integer from 0 to 10).
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public int returnQuiz2() {
		return quiz2;
	}

	/**
	 * Reads and assigns just the score for the midterm.
	 * 
	 * Postcondition: only the student's midterm score has been set or changed.
	 * 
	 */
	public void readMidterm() {
		keyboard = new Scanner(System.in);
		System.out.println("Midterm score (out of 100 points)?");
		midterm = keyboard.nextInt();
		while ((midterm < 0) || (midterm > 100)) {
			System.out.println("Sorry, but -");
			System.out.println("Midterm score must be between 0 and 100 -");
			System.out.println("Please enter a valid midterm score: ");
			midterm = keyboard.nextInt();
		}
	}

	/**
	 * Prints student's score for midterm.
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public void writeMidterm() {
		System.out.println("Midterm score (out of 100 pts) = " + midterm);
	}

	/**
	 * Returns student's score for midterm (an integer from 0 to 100).
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public int returnMidterm() {
		return midterm;
	}

	/**
	 * Reads and assigns just the score for the final exam.
	 * 
	 * Postcondition: only the student's final exam score has been set or changed.
	 * 
	 */
	public void readFinalExam() {
		keyboard = new Scanner(System.in);
		System.out.println("Final exam score (out of 100 points)?");
		finalExam = keyboard.nextInt();
		while ((finalExam < 0) || (finalExam > 100)) {
			System.out.println("Sorry, but -");
			System.out.println("Final exam score must be between 0 and 100 -");
			System.out.println("Please enter a valid final exam score: ");
			finalExam = keyboard.nextInt();
		}
	}

	/**
	 * Prints student's score for final exam.
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public void writeFinalExam() {
		System.out.println("Final exam score (out of 100 pts) = " + finalExam);
	}

	/**
	 * Returns student's score for final exam (an integer from 0 to 100).
	 * 
	 * Precondition: The student's name and scores for quizzes 1 and 2, midterm and
	 * final exam scores have been entered.
	 * 
	 */
	public int returnFinalExam() {
		return finalExam;
	}

	/**
	 * Calculate, sets and returns the student's per cent grade using a weighted
	 * average: quiz 1 and 2 are 10 points each and together count 25%, the midterm
	 * is 100 points and counts 25%, and the final exam is 100 points and counts
	 * 50%.
	 * 
	 * Precondition: The student's record has been entered (name and scores).
	 * 
	 * Postcondition: The value of percentGrade is assigned the calculated value.
	 * 
	 * Note: Grades have been entered as floating point values and arithmetic is
	 * done here (adding 0.5 and casting to integer) to round correctly.
	 * 
	 */
	public int getPercentGrade() {
		percentGrade = 0;
		percentGrade = (int) ( ((quiz1 + quiz2) * 0.25 + 0.25 * midterm + 0.5 * finalExam) + 0.5);
		return percentGrade;
	}

	/**
	 * Prints the student's per cent grade as an integer fro 0 to 100.
	 * 
	 * Precondition: The student's record has been entered (name and scores) and the
	 * percent grade set by "setPercentGrade" method and the percent grade has been
	 * set using the method getPercentGrade().
	 * 
	 */
	public void printPercentGrade() {
		System.out.println(name + "'s percent grade is " + percentGrade);
	}

	/**
	 * Determines, sets and returns the student's letter grade based on per cent
	 * grade: 90 or above = A, 80 to 89 = B, 70 to 79 = C, 60 to 69 = D, and 0 to 59
	 * = E.
	 * 
	 * Precondition: The student's record has been entered (name and scores).
	 * 
	 * Postcondition: a letter grade of A, B, C, D, or F has been assigned to
	 * letterGrade.
	 * 
	 */
	public char getLetterGrade() {
		if (percentGrade >= 90)
			letterGrade = 'A';
		else if (percentGrade >= 80)
			letterGrade = 'B';
		else if (percentGrade >= 70)
			letterGrade = 'C';
		else if (percentGrade >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		return letterGrade;
	}

	/**
	 * Prints the student's letter grade based on per cent grade: 90 or above = A,
	 * 80 to 89 = B, 70 to 79 = C, 60 to 69 = D, and 0 to 59 = E.
	 * 
	 * Precondition: The student's record has been entered (name and scores) and the
	 * letter grade set using the method getLetterGrade.
	 * 
	 */
	public void printLetterGrade() {
		System.out.println(name + "'s letter grade is " + letterGrade);
	}

}
