package exam;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		
		System.out.println("任意の数値を入力(最初は0以外の数値)");
		
		for(int i = 1; i != 0;) {
			int x = scan.nextInt();
			sum += x;
			count++;
			i = x;
		}
		count--;
		System.out.println("平均：" + sum / count);
		
		scan.close();

	}

}