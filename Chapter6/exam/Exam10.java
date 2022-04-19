package exam;

import java.util.Scanner;

public class Exam10 {

//	概要
//	引数に任意の数値を与えてメソッドcubeを呼び出す
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("任意の数値を入力");
		cube(sc.nextInt());
		
		sc.close();
	}
	
//	メソッド１
//	変数maxnumにnum1を代入する
//	配列arrayに引数num1、引数num2、引数num3を格納する
//	｛arra[i]がmaxnamより大きい場合、maxnumにarray[i]を代入する｝を【arrayの要素数】回繰り返す
//	「最も大きい数は【maxnum】です」を表示する
	public static void cube (int num) {
		System.out.println(num + "の３乗は" + num * num * num + "です");
	}

}

