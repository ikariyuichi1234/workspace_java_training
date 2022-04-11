package exam;

import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		
		System.out.println("xに任意の数値を代入します");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println("2x=" + x * 2);
		System.out.println("3x=" + x * 3);		
		System.out.println("4x=" + x * 4);
		
		scan.close();
	}

}
