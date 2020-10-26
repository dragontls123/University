import java.util.Scanner;

public class if_else{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("input cash");
		double cash = s.nextInt();
		double charge;
		if (cash < 0.25 || cash % 5 != 0 || cash > 1)
			System.out.println("error");
		
		if (cash < 10)
			charge = 1;
		else if (cash < 100)
			charge = cash * 0.1;
		else if (cash < 1000)
			charge = 5 + cash * 0.05;
		else
			charge = 40 + cash * 0.01;
		System.out.println("charge is " + charge);
		
	}
}
