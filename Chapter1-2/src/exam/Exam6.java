package exam;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		
		System.out.println("xに任意の数値を代入します");
		Scanner num01 = new Scanner(System.in);
		int x = num01.nextInt();
		
		System.out.println("yに任意の数値を代入します");
		Scanner num02 = new Scanner(System.in);
		int y = num02.nextInt();
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		num01.close();
		num02.close();
	}

}
