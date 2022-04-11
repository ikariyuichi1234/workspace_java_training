package exam;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("任意の文字列を入力");
		String str = scan.nextLine();
		
		int x = str.length();
		
		while(x > 10) {
			System.out.println("10文字以下の文字列を入力");
			str = scan.nextLine();
			x = str.length();
		}
		System.out.println("文字数：" + x);
		
		scan.close();

	}

}
