package exam1;
import java.util.Scanner;
public class Exam3 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		int rank = Integer.parseInt(sc.nextLine());
		String[] presents = sc.nextLine().split(" ");
		System.out.println(presents[rank - 1]);
		sc.close();

	}

}
