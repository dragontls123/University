/**
 * File name: Truck.java
 * 
 * Derived from Vehicls class.
 * 
 * In addition to Vehicle's owner, manufacturer and cylinder parameters, Truck
 * has a load capacity (in tons), and a towing capacity (in pounds).
 * 
 */
public class Truck extends Vehicle {
	private double load;// Capacity in tons
	private int tow; // Capacity in pounds

	// Constructors.
	// Includes all variations in Vehicle class,
	// plus one to specify all values, including
	// load and towing capacities.

	public Truck() {
		getOwner().setName("None");
		setManufacturer("None");
		setCylinders(0);
	}

	// The constructor Truck(Person)
	public Truck(Person theOwner) {
		getOwner().setName(theOwner.getName());
		setManufacturer("None");
		setCylinders(0);
	}

	// The constructor Truck(String)
	public Truck(String aBrand) {
		getOwner().setName("None");
		setManufacturer(aBrand);
		setCylinders(0);
	}

	// The constructor Truck(Person, String)/ is undefined
	public Truck(Person theOwner, String aBrand) {
		getOwner().setName(theOwner.getName());
		setManufacturer(aBrand);
		setCylinders(0);
	}

	// The constructor Truck(Person, int)
	public Truck(Person theOwner, int banger) {
		getOwner().setName(theOwner.getName());
		setManufacturer("None");
		setCylinders(banger);
	}

	// The constructor Truck(String, int)
	public Truck(String aBrand, int banger) {
		getOwner().setName("None");
		setManufacturer(aBrand);
		setCylinders(banger);
	}

	// The constructor Truck(Person, String, int)
	public Truck(Person theOwner, String aBrand, int banger) {
		getOwner().setName(theOwner.getName());
		setManufacturer(aBrand);
		setCylinders(banger);
	}

	// The constructor Truck(Person, String, int, double, int)
	public Truck(Person theOwner, String aBrand, int banger, double load, int tow) {
		getOwner().setName(theOwner.getName());
		setManufacturer(aBrand);
		setCylinders(banger);
		this.tow = tow;
		this.load = load;
	}

	// The method writeLoad()
	public void writeOutput() {
		System.out.println(getOwnerName());
		System.out.println(getManufacturer());
		System.out.println(getCylinders());
		System.out.println(load);
		System.out.println(tow);
	}

	// The method writeTow()
	public void writeTow() {
		System.out.println(tow);

	}

	// The method writeLoad()
	public void writeLoad() {
		System.out.println(load);

	}

	// The method set(Person, String, int)
	public void set(Person theOwner, String aBrand, int banger) {
		getOwner().setName(theOwner.getName());
		setManufacturer(aBrand);
		setCylinders(banger);
	}

	public void set(Person theOwner, String aBrand, int banger, double load, int tow) {
		getOwner().setName(theOwner.getName());
		setManufacturer(aBrand);
		setCylinders(banger);
		this.load = load;
		this.tow = tow;
	}

// The method setLoad(double)
	public void setLoad(double load) {
		this.load = load;
	}

// The method setTow(int)
	public void setTow(int tow) {
		this.tow = tow;
	}

	public boolean equals(Truck otherVehicle) {
		return super.equals((Vehicle)otherVehicle) && (otherVehicle.tow == tow) && (otherVehicle.load == load);
	}
}