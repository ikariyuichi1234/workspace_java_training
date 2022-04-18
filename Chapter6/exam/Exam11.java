package exam;

import java.util.Scanner;

public class Exam11 {
	
//	概要
//	変数numsc1、numsc2に任意の数値を代入する
//	引数にnumsc1、numsc2を与えてメソッドsumを呼び出す
//	引数にnumsc1、numsc2を与えてメソッドdiffを呼び出す
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numsc1 = sc.nextInt();
		int numsc2 = sc.nextInt();
		
		sum(numsc1, numsc2);
		
		diff(numsc1, numsc2);
		
		sc.close();
	}
	
//	メソッド１
//	「【引数num1】と【引数num2】の合計は【num1 + num2】です」を表示する
	public static void sum (int num1, int num2) {
		System.out.println(num1 + "と" + num2 + "の合計は" + (int)(num1 + num2) + "です");
	}
//	メソッド２
//	「【引数num1】と【引数num2】の差は【num1 + num2】です」を表示する
	public static void diff (int num1, int num2) {
		System.out.println(num1 + "と" + num2 + "の差は" + (int)(num1 - num2) + "です");
	}

}
