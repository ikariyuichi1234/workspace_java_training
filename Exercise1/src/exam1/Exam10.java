package exam1;
import java.util.Scanner;
public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");

		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}

		if ((data[0] + data[1]) % 2 == 1) {
			System.out.println("YES");
		} else if ((data[0] + data[1]) % 2 == 0) {
			System.out.println("NO");
		}
		sc.close();
	}



}
