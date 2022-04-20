package exam;

import java.util.Scanner;

public class Exam13 {
	static int shou;
	static int amari;

//	概要
//	引数に任意の数値を与えてメソッドcalcを呼び出す
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("任意の数値を入力");
		calc(sc.nextInt());
		
		sc.close();
	}
	
//	メソッド１
//	クラス変数shouに引数nを１０で割った商を代入する
//	クラス変数amariにnを１０で割った余りを代入する
//	「１０で割った商はshou、余りはamari」を表示する
	public static void calc (int n) {
		shou = n / 10;
		amari = n % 10;
		System.out.println("10で割った商は" + shou + "、余りは" + amari);
	}
	

}
