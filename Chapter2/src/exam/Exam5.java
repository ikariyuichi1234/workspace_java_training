package exam;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		
		System.out.println("任意の整数値を入力");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		if(x >= 0 && x % 2 == 0) {
			System.out.println("正の偶数");
		}
		if(x >= 0 && x % 2 != 0) {
			System.out.println("正の奇数");
		}
		if(x < 0 && x % 2 == 0) {
			System.out.println("負の偶数");
		}
		if(x < 0 && x % 2 != 0) {
			System.out.println("負の奇数");
		}
		
		scan.close();
	}

}
