/**

 File name: StudentGradeTest.java

 Class StudentGradeTest: tests the class StudentGrade.

 This test creates an object of class StudentGrade and
 exercises its methods.  The data elements of the class are:
   Student's name
   Score on quiz 1 (10 points, 1/2 of 25% of final grade)
   Score on quiz 1 (10 points, 1/2 of 25% of final grade)
   Score on midterm exam (100 points, 25% of final grade)
   Score on final exam (100 points, 50% of final grade)

 The class's public methods are:
   Request and read input data.
   Display all input data.
   Display quiz 1 score.
   Return quiz 1 score.
   Set just quiz 1 score.
   Display quiz 2 score.
   Return quiz 2 score.
   Set just quiz 2 score.
   Display midterm score.
   Return midterm score.
   Set just midterm score.
   Display final exam score.
   Return final exam score.
   Set just final exam score.
   Calculate, set and return grade as a percent.
   Display final grade as a percent.
   Calculate, set and return grade as a letter.
   Display final grade as a letter.
 */
import java.util.*;

public class StudentGradeTest 
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      StudentGrade aStudent = new StudentGrade();

      char repeat;
      do  // repeat if user says 'yes'
      {
         aStudent.readRecord();

         aStudent.writeRecord();

         aStudent.writeName();

         System.out.println("Student's name returned: "
                + aStudent.returnName());

         aStudent.writeQuiz1();

         System.out.println("Quiz 1 score returned: " + aStudent.returnQuiz1());

         aStudent.writeQuiz2();

         System.out.println("Quiz 2 score returned: " + aStudent.returnQuiz2());

         aStudent.writeMidterm();

         System.out.println("Midterm score returned: "
                + aStudent.returnMidterm());

         aStudent.writeFinalExam();

         System.out.println("Final Exam score returned: "
                + aStudent.returnFinalExam());

         System.out.println("Percent Grade = " + aStudent.getPercentGrade());

         aStudent.printPercentGrade();

         System.out.println("Letter Grade = " + aStudent.getLetterGrade());

         aStudent.printLetterGrade();

         aStudent.writeName(); // before
         aStudent.readName();	// modify
         aStudent.writeName(); // after

         aStudent.writeQuiz1(); // before
         aStudent.readQuiz1();	// modify
         aStudent.writeQuiz1(); // after

         aStudent.writeQuiz2(); // before
         aStudent.readQuiz2();	// modify
         aStudent.writeQuiz2(); // after

         aStudent.writeMidterm(); // before
         aStudent.readMidterm();	// modify
         aStudent.writeMidterm(); // after

         aStudent.writeFinalExam(); // before
         aStudent.readFinalExam();	// modify
         aStudent.writeFinalExam(); // after

         // recalculate and show new percent grade
         aStudent.getPercentGrade(); // must be recalculated before printing
         aStudent.printPercentGrade();

         // recalculate letter grade
         aStudent.getLetterGrade(); // must be recalculated before printing
         aStudent.printLetterGrade();

         System.out.println("Do again? (Y for Yes, or N for No)");
         repeat = keyboard.next().charAt(0);
      }while((repeat == 'y') || (repeat == 'Y'));
   }
}
