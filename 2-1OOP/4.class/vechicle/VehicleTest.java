/**

   File name: VehicleTest.java

   This program tests class Vehicle.

   It exercises each of the contructors, accessor, and mutator
   methods, and tests the "equals" method for both true and
   false cases.

   Uses Person class

   Author: Lew Rakocy
   email address: LRakocy@devrycols.edu
   Date: 9/7/2000
   Last changed:
   Updated for fourth edition by Brian Durney, December 2004

*/
import java.util.*;

public class VehicleTest
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      char repeat;

      do  // repeat if user says 'yes'
      {
         int i = 1;// Test case counter

         // Test the constructors (uses writeOutput method)

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Using default constructor & writeOutput().");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: None");
         System.out.println("Manufacturer: None");
         System.out.println("Number of cylinders: 0");
         System.out.println();
         Vehicle v1 = new Vehicle(); // default constructor
         v1.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Constructor specifying owner.");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: Ann");
         System.out.println("Manufacturer: None");
         System.out.println("Number of cylinders: 0");
         System.out.println();
         Person p1 = new Person("Ann");
         Vehicle v2 = new Vehicle(p1);
         v2.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Constructor specifying manufacturer.");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: None");
         System.out.println("Manufacturer: Honda");
         System.out.println("Number of cylinders: 0");
         System.out.println();
         Vehicle v3 = new Vehicle("Honda");
         v3.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Constructor specifying owner"
         	+ " and manufacturer: ");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: David");
         System.out.println("Manufacturer: Ford");
         System.out.println("Number of cylinders: 0");
         System.out.println();
         Person p2 = new Person("David");
         Vehicle v4 = new Vehicle(p2, "Ford");
         v4.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Constructor specifying owner"
         	+ " number of cylinders: ");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: Jill");
         System.out.println("Manufacturer: None");
         System.out.println("Number of cylinders: 4");
         System.out.println();
         Person p3 = new Person("Jill");
         Vehicle v5 = new Vehicle(p3, 4);
         v5.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Constructor specifying manufacturer"
         	+ " number of cylinders:");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: None");
         System.out.println("Manufacturer: Chevrolet");
         System.out.println("Number of cylinders: 8");
         System.out.println();
         Vehicle v6 = new Vehicle("Chevrolet", 8);
         v6.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Constructor specifying owner, "
         	+ "manufacturer, and number of cylinders: ");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: John");
         System.out.println("Manufacturer: Volvo");
         System.out.println("Number of cylinders: 6");
         System.out.println();
         Person p4 = new Person("John");
         Vehicle v7 = new Vehicle(p4, "Volvo", 6);
         v7.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         // Test methods to write each parameter value.

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Method to write owner name:");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: John");
         System.out.println();
         v7.writeOwnerName();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Method to write manufacturer:");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Manufacturer: Volvo");
         System.out.println();
         v7.writeManufacturer();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to write number of cylinders:");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Number of cylinders: 6");
         System.out.println();
         v7.writeCylinders();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change all parameter values:");
         System.out.println();
         System.out.println("Values before:");
         v7.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner: Caroline");
         System.out.println("Manufacturer: Audi");
         System.out.println("Number of cylinders: 5");
         System.out.println();
         Person p5 = new Person("Caroline");
         v7.set(p5, "Audi", 5);
         v7.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change just owner:");
         System.out.println();
         System.out.println("Values before:");
         v7.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner: Jake");
         System.out.println("Manufacturer: Audi");
         System.out.println("Number of cylinders: 5");
         System.out.println();
         Person p6 = new Person("Jake");
         v7.setOwner(p6);
         v7.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change manufacturer:");
         System.out.println();
         System.out.println("Values before:");
         v7.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner: Jake");
         System.out.println("Manufacturer: Jeep");
         System.out.println("Number of cylinders: 5");
         System.out.println();
         v7.setManufacturer("Jeep");
         v7.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change number of cylinders: ");
         System.out.println();
         System.out.println("Values before:");
         v7.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner : Jake");
         System.out.println("Manufacturer : Jeep");
         System.out.println("Number of cylinders : 10");
         System.out.println();
         v7.setCylinders(10);
         v7.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to test if two vehicles are the same,");
         System.out.println("i.e. they have the same owner, ");
         System.out.println("the same manufacturer, and ");
         System.out.println("the same number of cylinders.).");
         System.out.println("Note that this also tests the method "
            + "to get the owner of a vehicle.");
         System.out.println();
         System.out.println("Values of first vehicle:");
         //Change owner of v6 from "None" to "Ann"
         v6.setOwner(p1);
         v6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         //Change v7 values to be the same as v6
         v7.set(v6.getOwner(), v6.getManufacturer(), v6.getCylinders());
         v7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test:should be true.");
         System.out.println();
         System.out.println(v6.equals(v7));
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to test if two vehicles are the same:");
         System.out.println
            ("change owner of 1st vehicle so they are not equal.");
         System.out.println();
         System.out.println("Values of first vehicle:");
         //Change owner of v6 from "Ann" to "David"
         v6.setOwner(p2);
         v6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         v7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test:should be false.");
         System.out.println();
         System.out.println(v6.equals(v7));
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to test if two vehicles are the same:");
         System.out.println
            ("change owner back to be the same for both vehicles,");
         System.out.println
            ("but change manufacturer to be different.");
         System.out.println();
         System.out.println("Values of first vehicle:");
         //Change owner of v6 back so it is the same as v7
         v6.setOwner(p1);
         v6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         v7.setManufacturer("Ferrari");
         v7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test:should be false.");
         System.out.println();
         System.out.println(v6.equals(v7));
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to test if two vehicles are the same:");
         System.out.println
            ("change manufacturer so they're the same,");
         System.out.println
            ("but change number of cylinders to be differnt.");
         System.out.println();
         System.out.println("Values of first vehicle:");
         v6.setManufacturer("Ferrari");
         v6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         //Change number of cylinders to 12
         v7.setCylinders(12);
         v7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test:should be false.");
         System.out.println();
         System.out.println(v6.equals(v7));
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println("Do again? (Y for Yes, or N for No)");
         repeat = keyboard.next().charAt(0);

      }while((repeat == 'y') || (repeat == 'Y'));
   }
}
	