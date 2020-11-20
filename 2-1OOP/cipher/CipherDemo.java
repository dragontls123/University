public class CipherDemo {
	public static void main(String[] args) {
		//SubstitutionCipher
		String testString1 = "Abcdefg Hijklmno Pqrstu Vwxyz";
		System.out.print("SubstitutionCipher:"+testString1+" >> ");
		testString1 = new SubstitutionCipher(3).encode(testString1);
		System.out.println(testString1);

		//ShuffleCipher
		System.out.println();
		String testString2 = "abcdefghi";
		System.out.print("ShuffleCipher:"+testString2+" >> ");
		testString2 = new ShuffleCipher(1).encode(testString2);
		System.out.println(testString2);
	}
}