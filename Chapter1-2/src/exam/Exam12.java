package exam;

import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {
		
		System.out.println("sに任意の文字列を入力します");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println("sを表示：" + s);
		
		scan.close();
	}

}
