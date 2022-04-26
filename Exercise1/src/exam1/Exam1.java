package exam1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exam1 {
	public static void main (String[] args) {
		
		
		try {
			Scanner sc = new Scanner(System.in);
			int lengthNum = sc.nextInt();
			for (int i = 0; i < lengthNum; i++) {
				System.out.print("*");
			}
			System.out.println();
			sc.close();
			
		} catch (InputMismatchException e) {
			System.err.println("数字を入力してください");
		}
	}
}
