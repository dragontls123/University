
public class BubbleSort {
	static int temp;

	public static void sort(int[] b) {
		for (int i = b.length - 1; i > 0; i--) {
			for (int index = 0; index < b.length - 1; index++)
				if (b[index] > b[index + 1]) {
					temp = b[index];
					b[index] = b[index + 1];
					b[index + 1] = temp;
				}
		}

	}
}