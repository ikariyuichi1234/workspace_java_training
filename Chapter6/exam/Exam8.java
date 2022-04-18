package exam;

import java.util.Scanner;

public class Exam8 {

//	概要
//	引数に任意の数値２つを与えてメソッドminを呼び出す
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("任意の数値を2回入力");
		min(sc.nextInt(), sc.nextInt());
		
		sc.close();
	}
//	メソッド１
//	引数num1が引数num2より小さければ｛最も小さい数はnum1です｝を表示する
//	num2がnum1より小さければ｛最も小さい数はnum2です｝を表示する
	public static void min (int num1, int num2) {
		if (num1 < num2) {
			System.out.println("最も小さい数は" + num1 + "です");
		} else if (num1 > num2) {
			System.out.println("最も小さい数は" + num2 + "です");
		}
	}

}
