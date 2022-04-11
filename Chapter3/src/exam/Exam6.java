package exam;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("任意の数値を入力");
		int n = scan.nextInt();
		int x = 1;
		int sum = 1;
		System.out.print(1);

		
		while(n > x) {
			x++;
			System.out.print("+" + x);
			sum += x;
		}
		
		System.out.println("=" + sum);
		
		scan.close();

	}

}
