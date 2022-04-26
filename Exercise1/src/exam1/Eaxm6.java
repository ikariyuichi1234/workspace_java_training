package exam1;
import java.util.Scanner;
public class Eaxm6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int area = Integer.parseInt(sc.nextLine());
		String[] array = sc.nextLine().split(" ");

		int min =getMin(dataTrance(array));

		System.out.println(area * min);

		sc.close();


	}
	public static Integer[] dataTrance (String[] array) {
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		return data;
	}


	public static int getMin (Integer[] numData) {
		int min = numData[0];
		for (int i = 0; i < numData.length; i++) {
			if (min > numData[i]) {
				min = numData[i];
			}
		}
		return min;
	}

}
