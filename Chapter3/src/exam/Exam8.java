package exam;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "yes";
		
		while(str.equals("yes")) {
			System.out.println("【yes】と入力しないでください。");
			str = scan.nextLine();
		}
		System.out.println("ありがとうございました。");

		scan.close();

	}

}