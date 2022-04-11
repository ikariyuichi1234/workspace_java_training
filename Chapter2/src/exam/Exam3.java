package exam;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		
		System.out.println("xに任意の数値を入力します");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println("yに任意の数値を入力します");
		int y = scan.nextInt();
		
		if(x > y) {
			System.out.println("xはyより大きい");
		} else if(x < y) {
			System.out.println("xはyより小さい");
		} else if(x == y) {
			System.out.println("xとyは等しい");
		}
		
		scan.close();
	}

}
