package exam;

import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {
		
		System.out.println("２つの整数値を入力");
		Scanner num01 = new Scanner(System.in);
		int x = num01.nextInt();
		
		Scanner num02 = new Scanner(System.in);
		int y = num02.nextInt();
		
		System.out.println("平均：" + (int)((x + y) / 2));
		
		num01.close();
		num02.close();
		
	}
}
