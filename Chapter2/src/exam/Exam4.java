package exam;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		
		System.out.println("正の整数値を入力します");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		if(x % 2 == 1) {
			System.out.println(x + "は奇数です");
			
		} else if(x % 2 == 0) {
			System.out.println(x + "は偶数です");
			
		}
		
		scan.close();
	}

}
