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
//	「【引数num】の3乗は【 num × num × num】です」を表示する
	public static void cube (int num) {
		System.out.println(num + "の3乗は" + num * num * num + "です");
	}

}

