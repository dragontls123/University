public class OneWayNoRepeatsList {
	public static int START_POSITION = 0;
	public static int DEFAULT_SIZE = 50;
//entry.length is the total number of items you have room
//for on the list (its capacity);
//countOfEntries is the number of items currently on the list.
	private int countOfEntries; // can be less than entry.length.
	private String[] entry;

	/**
	 * Creates an empty list with a given capacity.
	 */
	public OneWayNoRepeatsList(int maximumNumberOfEntries) {
		entry = new String[maximumNumberOfEntries];
		countOfEntries = 0;
	}

	/**
	 * Creates an empty list with a capacity of DEFAULT_SIZE.
	 */
	public OneWayNoRepeatsList() {
		entry = new String[DEFAULT_SIZE];
		countOfEntries = 0;
// or replace these two statements with this(DEFAULT_SIZE);
	}

	public int getMaximumNumberOfEntries() {
		return entry.length;
	}

	public int getNumberOfEntries() {
		return countOfEntries;
	}

	public boolean isFull() {
		return countOfEntries == entry.length;
	}

	public boolean isEmpty() {
		return countOfEntries == 0;
	}

	public boolean isOnList(String item) {
		for (int i = 0; i < countOfEntries; i++) {
			if (item.equalsIgnoreCase(entry[i]))
				return true;
		}
		return false;
	}

	public void addItem(String item) {
		if (isOnList(item)) {
			System.out.println("The item is already on the list!");
		} else if (isFull()) {
			System.out.println("Adding to a full list!");
			System.exit(0);
		} else {
			entry[countOfEntries] = item;
			countOfEntries++;
		}
	}

	public String getEntryAt(int position) {
		String result = null;
		if ((0 <= position) && (position < countOfEntries))
		result = entry [position];
		return result;
		}
		
	public void eraseList() {
		countOfEntries = 0;
	}

	/**
	 * Returns true if position indicates the last item on the list; otherwise,
	 * returns false.
	 */
	public boolean atLastEntry(int position) {
		return position == countOfEntries;
	}
}