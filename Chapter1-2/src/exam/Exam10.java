package exam;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		
		System.out.println("xに任意の数値を代入します");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println("xより小さい任意の数値を入力してください");
		int y = scan.nextInt();
		
		while(y >= x) {
			System.out.println("xより小さい任意の数値を入力してください");
			y = scan.nextInt();
		}
		System.out.println("xを" + y + "で割った商は" +  x / y + "、余りは" + x % y);
		
		scan.close();
	}

}
