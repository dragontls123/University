import java.util.Scanner;

public class holiday {
	private String name;
	private int day;
	private String month;

	public holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}

	public boolean isSameMonth(holiday h) {
		return month.equals(h.month);

	}

	public boolean equals(holiday h) {
		return name.equals(h.name) && day == h.day && (month.equals(h.month));
	}

	public static void main(String[] args) {
		holiday h1 = new holiday("Independence day", 1, "March");
		holiday h2 = new holiday("3.15", 1, "March");
		
		System.out.println("Are they in the same month? "
		+(h1.isSameMonth(h2)?"Yes":"No"));	
	}
}
