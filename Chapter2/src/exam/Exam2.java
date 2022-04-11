package exam;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		
		System.out.println("２つの整数値を入力");
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(x > y) {
			System.out.println(x);
			
		} else if(x < y) {
			System.out.println(y);
			
		}
		scan.close();

	}

}
