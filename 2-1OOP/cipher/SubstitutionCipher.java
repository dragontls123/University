public class SubstitutionCipher implements MessageEncoder {
	private int shift = 0;

//constructor with one parameter to shift
	public SubstitutionCipher(int shift) {
		this.shift = shift;
	}

	@Override
	public String encode(String plainText) {
		String encodedText = new String();

		for (int i = 0; i < plainText.length(); i++) {
			if ('A' <= plainText.charAt(i) && plainText.charAt(i) <= 'Z') {// change capital letter
				encodedText += (char) ('A' + (((plainText.charAt(i) - 'A') + shift) % 26));
			} else if ('a' <= plainText.charAt(i) && plainText.charAt(i) <= 'z') {// change lower case
				encodedText += (char) ('a' + (((plainText.charAt(i) - 'a') + shift) % 26));
			} else {// others are not changed
				encodedText += plainText.charAt(i);
			}
		}

		return encodedText;
	}
}