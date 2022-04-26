package exam2;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(replaceStr(sc.nextLine()));

		sc.close();


	}
//	文字列に含まれる暗号を置き換える
	public static String replaceStr (String str) {
		String reStr01 = str.replaceAll("A", "4");
		String reStr02 = reStr01.replaceAll("E", "3");
		String reStr03 = reStr02.replaceAll("G", "6");
		String reStr04 = reStr03.replaceAll("I", "1");
		String reStr05 = reStr04.replaceAll("O", "0");
		String reStr06 = reStr05.replaceAll("S", "5");
		return reStr06.replaceAll("Z", "2");
	}

}
