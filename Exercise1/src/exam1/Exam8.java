package exam1;
import java.util.Scanner;
public class Exam8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");

		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}

		System.out.println(data[0] * data[1]);

		sc.close();
	}

}
