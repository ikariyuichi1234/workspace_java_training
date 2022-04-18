package exam2;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CoinCase2 ccSecond = new CoinCase2();
		
		
//		種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
		for (int i = 0; i < 10; i++) {
			System.out.println("硬貨の種類を入力");
			System.out.println("硬貨の枚数を入力");
			ccSecond.AddCoins(sc.nextInt(), sc.nextInt());
		}
//		各硬貨が何枚でいくらあるかを表示する。
		System.out.println("500円硬貨は" + ccSecond.yen500 + "枚、" + ccSecond.GetAmount(500) + "円分あります。");
		System.out.println("500円硬貨は" + ccSecond.yen100 + "枚、" + ccSecond.GetAmount(100) + "円分あります。");
		System.out.println("500円硬貨は" + ccSecond.yen50 + "枚、" + ccSecond.GetAmount(50) + "円分あります。");
		System.out.println("500円硬貨は" + ccSecond.yen10 + "枚、" + ccSecond.GetAmount(10) + "円分あります。");
		System.out.println("500円硬貨は" + ccSecond.yen5 + "枚、" + ccSecond.GetAmount(5) + "円分あります。");
		System.out.println("500円硬貨は" + ccSecond.yen1 + "枚、" + ccSecond.GetAmount(1) + "円分あります。");
		
//		硬貨の総枚数を表示する。
		System.out.println("硬貨の総枚数は" + ccSecond.GetCount() + "枚です。");
		
//		総額を表示する。
		System.out.println("総額は" + ccSecond.GetAmount() + "円です。");
		
		sc.close();
	}
}
