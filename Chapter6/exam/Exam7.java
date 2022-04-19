package exam;

import java.util.Scanner;

public class Exam7 {

//	概要
//	引数に任意の文字列、任意の数値を与えてメソッドloopMsgを呼び出す
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("表示する文字列");
		System.out.println("表示する回数を入力");
		loopMsg(sc.nextLine(), sc.nextInt());
		
		sc.close();
	}
	
//	メソッド1
//	｛引数msgを表示する｝を【引数num】回繰り返す
	public static void loopMsg (String msg, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(msg);
		}
	}

}
