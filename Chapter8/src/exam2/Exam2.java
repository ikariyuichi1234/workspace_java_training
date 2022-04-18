package exam2;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CoinCase ccFirst = new CoinCase();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("硬貨の種類を入力");
			System.out.println("硬貨の枚数を入力");
			ccFirst.AddCoins(sc.nextInt(), sc.nextInt());
		}
		
		System.out.println("500円硬貨は" +ccFirst.GetCoins(500) + "枚です。");
		System.out.println("100円硬貨は" + ccFirst.GetCoins(100) + "枚です。");
		System.out.println("50円硬貨は" + ccFirst.GetCoins(50) + "枚です。");
		System.out.println("10円硬貨は" + ccFirst.GetCoins(10) + "枚です。");
		System.out.println("5円硬貨は" + ccFirst.GetCoins(5) + "枚です。");
		System.out.println("1円硬貨は" + ccFirst.GetCoins(1) + "枚です。");
		System.out.println("総額は" + ccFirst.GetAmount() + "円です。");
		

		sc.close();
	}

}
