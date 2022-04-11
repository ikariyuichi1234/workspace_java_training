package exam;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		
		System.out.println("xに任意の数値を入力します");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println("yに任意の数値を入力します");
		int y = scan.nextInt();
		
		System.out.println("x+y = " + (int)(x + y));
		System.out.println("x-y = " + (int)(x - y));
		System.out.println("xy = " + (int)(x * y));
		System.out.println("x/y = " + (int)(x / y) + "余り" +(int)(x % y));
		
		scan.close();
	}

}
