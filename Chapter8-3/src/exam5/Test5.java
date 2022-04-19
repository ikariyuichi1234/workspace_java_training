package exam5;

public class Test5 extends TestSuper {
	private int count;
	
	public int search (String[] array, int start, String data) {
		for (int i = start; i < array.length; i++) {
				if (array[i].contains(data)) {
					count++;
				}
			}
			return count;
	}
}
