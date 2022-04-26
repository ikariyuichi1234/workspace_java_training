package exam1;
import java.util.Scanner;

public class Exam5 {
	public static void main (String[] args) {
		replaceStr();

	}
	public static void replaceStr () {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reStr01 = str.replaceAll("0", "C");
		String reStr02 = reStr01.replaceAll("1", "A");
		String reStr03 = reStr02.replaceAll("2", "B");
		System.out.println(reStr03);
		sc.close();
	}

}
