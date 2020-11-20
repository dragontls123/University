public class ShuffleCipher implements MessageEncoder {
	private int n = 0;

//constructor with one parameter 
	public ShuffleCipher(int n) {
		this.n = n;
	}

	@Override
	public String encode(String plainText) {
		int aLength = Math.round((float) plainText.length() / 2);//index of half
		String result = new String();

		for (int t = 0; t < n; t++) {
			String a = plainText.substring(0, aLength);//substring of first half
			String b = plainText.substring(aLength);//substring of second half

			for (int i = 0; i < a.length(); i++) {//input half alternately
				result += a.charAt(i);

				if (i < b.length()) {
					result += b.charAt(i);
				}
			}
		}

		return result;
	}
}