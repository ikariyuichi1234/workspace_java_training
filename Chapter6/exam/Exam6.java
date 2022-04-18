package exam;

import java.util.Scanner;

public class Exam6 {

//	概要　変数countに任意の数値を入力する
//	　　　引数にcountを与えてメソッドcountUpを実行する
//	　　　引数にcountを与えてメソッドcountDownを実行する
	public static void main(String[] args) {
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("任意の数値を入力");
		count = sc.nextInt();
		
		countUp(count);
		
		countDown(count);
		
		sc.close();
	}
	
//	メソッド１　numをインクリメントする
//	　　　　　　displayメソッドを呼び出す	
	public static void countUp (int num) {
		num++;
		display(num);
	}
//							
//	メソッド２　numをデクリメントする
//　　　　　　　displayメソッドを呼び出す	
	public static void countDown (int num) {
		num--;
		display(num);
	}
//										
//	メソッド３　「現在のカウントは〇です」と表示する	
	public static void display (int num) {
		System.out.println("現在のカウントは" + num + "です");
	}


}
