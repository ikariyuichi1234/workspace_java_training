package exam;

import java.util.Scanner;

public class Exam9 {

//	概要
//	引数に任意の数値３つを与えてメソッドmaxを呼び出す
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("任意の数値を３つ入力");
		max(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		sc.close();
	}
	
//	メソッド１
//	変数maxnumにnum1を代入する
//	配列arrayに引数num1、引数num2、引数num3を格納する
//	｛arra[i]がmaxnamより大きい場合、maxnumにarray[i]を代入する｝を【arrayの要素数】回繰り返す
//	「最も大きい数は【maxnum】です」を表示する
	public static void max (int num1, int num2, int num3) {
		int maxnum = num1;
		Integer[] array = {num1, num2, num3};
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxnum) {
				maxnum = array[i];
			}
		}
		System.out.println("最も大きい数は" + maxnum + "です");
	}

}
