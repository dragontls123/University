
public class OverLoad {
	public static void main(String[] args) {
		double average1 = OverLoad.getAverage(40.0, 50.0);
		double average2 = OverLoad.getAverage(1.0, 2.0, 3.0);
		char average3 = OverLoad.getAverage('a', 'c');
		System.out.println("Average1= " + average1);
		System.out.println("Average2= " + average2);
		System.out.println("Average3= " + average3);

	}

	public static double getAverage(double first, double second) {
		return (first + second) / 2.0;
	}

	public static double getAverage(double first, double second, double third) {
		return (first + second + third) / 3.0;
	}

	public static char getAverage(char first, char second) {
		return (char) (((int) first + (int) second) / 2);
	}
}
