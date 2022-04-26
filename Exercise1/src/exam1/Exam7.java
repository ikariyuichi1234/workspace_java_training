package exam1;
import java.util.Scanner;

public class Exam7 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int kyaku = Integer.parseInt(sc.nextLine());
		String[] array = sc.nextLine().split(" ");
		
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		
		if (kyaku > data[0]) {
			System.out.println(kyaku * data[1]);
		} else {
			System.out.println(kyaku * data[2]);
		}
		sc.close();
	}
	
}
