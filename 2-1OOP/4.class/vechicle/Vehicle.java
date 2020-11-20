/**
 * File name: Vehicle.java
 * 
 * Base Class for objects that contain a manufacturer's name, number of
 * cylinders, and owner.
 * 
 */
public class Vehicle {
	private String manufacturer;
	private int cylinders;
	private Person owner = new Person();

	// Constructors.
	// Default: no parameters are specified.
	// All other constructors: at least a manufacturer's or owner's
	// name is required.

	public Vehicle() {
		owner.setName("None");
		manufacturer = "None";
		cylinders = 0;
	}

	public Vehicle(String aBrand) {
		owner.setName("None");
		manufacturer = aBrand;
		cylinders = 0;
	}

	public Vehicle(String aBrand, int banger) {
		owner.setName("None");
		manufacturer = aBrand;
		cylinders = banger;
	}

	public Vehicle(Person theOwner) {
		owner.setName(theOwner.getName());
		manufacturer = "None";
		cylinders = 0;
	}

	public Vehicle(Person theOwner, int banger) {
		owner.setName(theOwner.getName());
		manufacturer = "None";
		cylinders = banger;

	}

	public Vehicle(Person theOwner, String brand) {
		owner.setName(theOwner.getName());
		manufacturer = brand;
		cylinders = 0;

	}

	public Vehicle(Person theOwner, String brand, int banger) {
		owner.setName(theOwner.getName());
		manufacturer = brand;
		cylinders = banger;

	}

	// Methods to write values:

	// Write all values

	public void writeOutput() {
		System.out.println(owner.getName());
		System.out.println(manufacturer);
		System.out.println(cylinders);
	}

	public void writeOwnerName() {

		System.out.println(owner.getName());
	}

	public void writeManufacturer() {
		System.out.println(manufacturer);

	}

	public void writeCylinders() {
		System.out.println(cylinders);

	}

	// Methods to change values of parameters.

	public void set(Person newOwner, String newBrand, int newCylinders) {
		manufacturer = newBrand;
		cylinders = newCylinders;
		owner.setName(newOwner.getName());
	}

	public void setOwner(Person newOwner) {
		owner.setName(newOwner.getName());
	}

	public void setManufacturer(String newBrand) {
		manufacturer = newBrand;

	}

	public void setCylinders(int newCylinders) {
		cylinders = newCylinders;

	}

	// Methods to return parameter values.

	public Person getOwner() {
		return owner;
	}

	public String getOwnerName() {
		return owner.getName();
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getCylinders() {
		return cylinders;
	}

	// equals method

	public boolean equals(Vehicle otherVehicle) {
		return (owner.hasSameName(otherVehicle.owner)) && (otherVehicle.cylinders == cylinders)
				&& manufacturer.equalsIgnoreCase(otherVehicle.manufacturer);
	}
}