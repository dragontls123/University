public class equals {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		boolean strEqual = (s1 == s2);
		System.out.println(strEqual);//false

		String s3 = new String("Hello");
		String s4 = s3;
		strEqual = (s3 == s4);
		System.out.println(strEqual);//true

		String s5 = new String("Hello");
		String s6 = new String("Hello");
		strEqual = (s5.equals(s6));
		System.out.println(strEqual);//true
	}
}
