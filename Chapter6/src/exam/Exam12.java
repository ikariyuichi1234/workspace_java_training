package exam;

import java.util.Scanner;

public class Exam12 {

//	概要
//	引数に任意の数値2つを与えてメソッドprocessを呼び出す
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("任意の数値を2つ入力");
		process(sc.nextInt(), sc.nextInt());
		
		sc.close();
	}
	
//	メソッド１
//	｛引数sekiを表示する｝を【引数wa】回繰り返す
	public static void putNumbers (int seki, int wa) {
		for (int i = 0; i < wa; i++) {
			System.out.println(seki);
		}
	}
//	メソッド２
//	変数sumに【引数a + 引数b】を代入する
//	変数multiに【a × b】を代入する
//	引数にmulti, sumを与えてメソッドputNumbersを呼び出す
	public static void process (int a, int b) {
		int sum = a + b;
		int multi = a * b;
		putNumbers(multi, sum);
	}
}
