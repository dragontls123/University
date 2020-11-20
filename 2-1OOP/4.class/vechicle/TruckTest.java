/**

   File name: TruckTest.java

   This program tests class Truck.

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

public class TruckTest
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
         System.out.println("Load capacity: 0 tons.");
         System.out.println("Towing capacity: 0 pounds.");
         System.out.println();
         Truck t1 = new Truck(); // default constructor
         t1.writeOutput();
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
         System.out.println("Load capacity: 0 tons.");
         System.out.println("Towing capacity: 0 pounds.");
         System.out.println();
         Person p1 = new Person("Ann");
         Truck t2 = new Truck(p1);
         t2.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Constructor specifying manufacturer.");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: None");
         System.out.println("Manufacturer: Dodge");
         System.out.println("Number of cylinders: 0");
         System.out.println("Load capacity: 0 tons.");
         System.out.println("Towing capacity: 0 pounds.");
         System.out.println();
         Truck t3 = new Truck("Dodge");
         t3.writeOutput();
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
         System.out.println("Load capacity: 0 tons.");
         System.out.println("Towing capacity: 0 pounds.");
         System.out.println();
         Person p2 = new Person("David");
         Truck t4 = new Truck(p2, "Ford");
         t4.writeOutput();
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
         System.out.println("Load capacity: 0 tons.");
         System.out.println("Towing capacity: 0 pounds.");
         System.out.println();
         Person p3 = new Person("Jill");
         Truck t5 = new Truck(p3, 4);
         t5.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Constructor specifying manufacturer"
         	+ " number of cylinders: ");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: None");
         System.out.println("Manufacturer: Chevrolet");
         System.out.println("Number of cylinders: 8");
         System.out.println("Load capacity: 0 tons.");
         System.out.println("Towing capacity: 0 pounds.");
         System.out.println();
         Truck t6 = new Truck("Chevrolet", 8);
         t6.writeOutput();
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
         System.out.println("Load capacity: 0 tons.");
         System.out.println("Towing capacity: 0 pounds.");
         System.out.println();
         Person p4 = new Person("John");
         Truck t7 = new Truck(p4, "Volvo", 6);
         t7.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Constructor specifying all parameters.");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: Peggy");
         System.out.println("Manufacturer: Volkswagen");
         System.out.println("Number of cylinders: 4");
         System.out.println("Load capacity: 1.5 tons.");
         System.out.println("Towing capacity: 2000 pounds.");
         System.out.println();
         Person p5 = new Person("Peggy");
         Truck t8 = new Truck(p5, "Volkswagen", 4, 1.5, 2000);
         t8.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         // Test methods to write each parameter value.

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Method to write owner name: ");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Owner: Peggy");
         System.out.println();
         t8.writeOwnerName();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println("Method to write manufacturer: ");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Manufacturer: Volkswagen");
         System.out.println();
         t8.writeManufacturer();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to write number of cylinders: ");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Number of cylinders: 4");
         System.out.println();
         t8.writeCylinders();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to write load capacity: ");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Load capacity: 1.5 tons");
         System.out.println();
         t8.writeLoad();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to write towing capcity: ");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Towing capacity: 2000 pounds");
         System.out.println();
         t8.writeTow();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change all parameter values: ");
         System.out.println();
         System.out.println("Values before:");
         t1.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner: Caroline");
         System.out.println("Manufacturer: Citroen");
         System.out.println("Number of cylinders: 3");
         System.out.println("Load capacity: 0.5 tons.");
         System.out.println("Towing capacity: 1000 pounds.");
         System.out.println();
         Person p6 = new Person("Caroline");
         t1.set(p6, "Citroen", 3, 0.5, 1000);
         t1.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change just owner: ");
         System.out.println();
         System.out.println("Values before:");
         t1.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner: Jake");
         System.out.println("Manufacturer: Citroen");
         System.out.println("Number of cylinders: 3");
         System.out.println("Load capacity: 0.5 tons.");
         System.out.println("Towing capacity: 1000 pounds.");
         System.out.println();
         Person p7 = new Person("Jake");
         t1.setOwner(p7);
         t1.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change manufacturer: ");
         System.out.println();
         System.out.println("Values before:");
         t1.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner: Jake");
         System.out.println("Manufacturer: Jeep");
         System.out.println("Number of cylinders: 3");
         System.out.println("Load capacity: 0.5 tons.");
         System.out.println("Towing capacity: 1000 pounds.");
         System.out.println();
         t1.setManufacturer("Jeep");
         t1.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change number of cylinders: ");
         System.out.println();
         System.out.println("Values before:");
         t1.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner: Jake");
         System.out.println("Manufacturer: Jeep");
         System.out.println("Number of cylinders: 6");
         System.out.println("Load capacity: 0.5 tons.");
         System.out.println("Towing capacity: 1000 pounds.");
         System.out.println();
         t1.setCylinders(6);
         t1.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change load capacity: ");
         System.out.println();
         System.out.println("Values before:");
         t1.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner: Jake");
         System.out.println("Manufacturer: Jeep");
         System.out.println("Number of cylinders: 6");
         System.out.println("Load capacity: 1.25 tons.");
         System.out.println("Towing capacity: 1000 pounds.");
         System.out.println();
         t1.setLoad(1.25);
         t1.writeOutput();
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to change towing capacity: ");
         System.out.println();
         System.out.println("Values before:");
         t1.writeOutput();
         System.out.println();
         System.out.println("Verify values after changes:");
         System.out.println("Owner: Jake");
         System.out.println("Manufacturer: Jeep");
         System.out.println("Number of cylinders: 6");
         System.out.println("Load capacity: 1.25 tons.");
         System.out.println("Towing capacity: 2599 pounds.");
         System.out.println();
         t1.setTow(2599);
         t1.writeOutput();
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
         t6.setOwner(p1);
         t6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         //Change v7 values to be the same as v6
         t7.set(t6.getOwner(), t6.getManufacturer(), t6.getCylinders());
         t7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test: should be true.");
         System.out.println();
         System.out.println(t6.equals(t7));
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
         t6.setOwner(p2);
         t6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         t7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test: should be false.");
         System.out.println();
         System.out.println(t6.equals(t7));
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
         t6.setOwner(p1);
         t6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         t7.setManufacturer("Mercedes");
         t7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test: should be false.");
         System.out.println();
         System.out.println(t6.equals(t7));
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
         t6.setManufacturer("Mercedes");
         t6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         //Change number of cylinders to 10
         t7.setCylinders(10);
         t7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test: should be false.");
         System.out.println();
         System.out.println(t6.equals(t7));
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to test if two vehicles are the same:");
         System.out.println
            ("change cylinders to be the same,");
         System.out.println
            ("but change load capacity to be different.");
         System.out.println();
         System.out.println("Values of first vehicle:");
         t6.setCylinders(10);
         t6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         //Change load to 0.1
         t7.setLoad(0.1);
         t7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test: should be false.");
         System.out.println();
         System.out.println(t6.equals(t7));
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println();
         System.out.println("Test case " + i + " :");
         System.out.println
         	("Method to test if two vehicles are the same:");
         System.out.println
            ("change load capacity so they're the same,");
         System.out.println
            ("but change towing capacity to be differnt.");
         System.out.println();
         System.out.println("Values of first vehicle:");
         //Make towing capacity different
         t6.setLoad(0.1);
         t6.setTow(1);
         t6.writeOutput();
         System.out.println();
         System.out.println("Values of second vehicle:");
         //Change load capacity to be the same
         t7.writeOutput();
         System.out.println();
         System.out.println("Verify equals test: should be false.");
         System.out.println();
         System.out.println(t6.equals(t7));
         System.out.println();
         System.out.println("===============================");
         ++i;

         System.out.println("Do again? (Y for Yes, or N for No)");
         repeat = keyboard.next().charAt(0);

      }while((repeat == 'y') || (repeat == 'Y'));
   }
}
