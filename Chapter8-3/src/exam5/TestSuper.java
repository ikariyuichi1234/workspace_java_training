package exam5;

public class TestSuper {
	
	public int search (String[] array, int start, String data) {
		for (int i = start; i < array.length; i++) {
			if (array[i].contains(data)) {
				return i;
			}
		}
		return -1;
	}
}
