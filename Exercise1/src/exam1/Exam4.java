package exam1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4 {
	public static void main (String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println(sc.nextInt() * 12);
			sc.close();
		} catch (InputMismatchException e) {
			System.err.println("数字を入力してください");
		}
	}

}
