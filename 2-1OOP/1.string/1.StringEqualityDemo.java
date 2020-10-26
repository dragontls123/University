import java.util.Scanner;

public class StringEqualityDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1, s2;
        System.out.println("input s1");
        s1 = s.nextLine();
        System.out.println("input s2");
        s2 = s.nextLine();

        if (s1.equals(s2)) {
            System.out.println("The two lines are equal");//this
        } else {
            System.out.println("The two lines are not equal");
        }
        if (s2.equals(s1)) {
            System.out.println("The two lines are equal");//this
        } else {
            System.out.println("The two lines are not equal");
        }
        if (s2.equalsIgnoreCase(s1)) {
            System.out.println("The two lines are equal, ignoring case");
        } else {
            System.out.println("The two lines are not equal");
        }
    }
}
