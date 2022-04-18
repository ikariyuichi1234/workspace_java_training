package exam2;

import java.util.Scanner;

public class Exam2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CoinCase ccSecond = new CoinCase();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("硬貨の種類を入力");
			System.out.println("硬貨の枚数を入力");
			ccSecond.AddCoins(sc.nextInt(), sc.nextInt());
		}
		
		sc.close();

	}

}
