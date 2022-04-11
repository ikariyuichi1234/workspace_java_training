package exam;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("任意の数値を入力(最初は0以外の数値)");
		
		for(int i = 1; i != 0;) {
			int x = scan.nextInt();
			sum += x;
			i = x;
		}
		
		System.out.println("合計：" + sum);
		
		scan.close();

	}

}
