
public class echo {
	public static void main(String[] args) {
		double sum = 0;
		int firstArg;
		if (args.length > 0) {
			try {
				firstArg = Integer.parseInt(args[0]);

			} catch (NumberFormatException e) {
				System.err.println("Argument" + args[0] + " must be an integer.");
				System.exit(1);
			}
		}
		for (String s : args) {
			sum += Integer.parseInt(s);
		}
		System.out.println("Average =" + (sum / args.length));
	}
}