package exam1;
import java.util.Scanner;
public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lengthNum = sc.nextInt();
		System.out.println((int)(6 * lengthNum * lengthNum));
		sc.close();
	}
}
