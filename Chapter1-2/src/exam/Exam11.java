package exam;

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		
		System.out.println("xに任意の数値を代入します");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		x++;
		System.out.println("x++を実行しました：x=" + x);
		
		x--;
		System.out.println("x--を実行しました：x=" + x);
		
		scan.close();
	}

}
