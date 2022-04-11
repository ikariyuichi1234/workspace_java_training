package exam;

import java.util.Scanner;

public class Exam9 {
	public static void main(String[] args) {
		
		System.out.println("xに任意の数値を代入します");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println("x^1=" + (int)Math.pow(x, 1));
		System.out.println("x^2=" + (int)Math.pow(x, 2));		
		System.out.println("x^3=" + (int)Math.pow(x, 3));
		
		scan.close();
	}

}
