public class ArraySorter {
	public static void selectionSort(int[] anArray) {
		for (int index = 0; index < anArray.length - 1; index++) { // Place the correct value in anArray[index]
			int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfNextSmallest, anArray);
			// Assertion:anArray[0] <= anArray[1] <=...<= anArray[index]
			// and these are the smallest of the original array elements.
			// The remaining positions contain the rest of the original
			// array elements.
		}
	}

	private static int getIndexOfSmallest(int startIndex, int[] a) {
		int min = a[startIndex];
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index < a.length; index++) {
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
				// min is smallest of a[startIndex] through a[index]
			}
		}
		return indexOfMin;
	}

	private static void interchange(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; // original value of a[i]
	}
}