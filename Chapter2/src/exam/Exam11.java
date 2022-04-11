package exam;

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("お金を投入してください。");
		int balance = scan.nextInt();
		
		if(balance >= 160) {
			balance -= 160;
			
			if(balance == 0) {
				System.out.println("ドリンクが購入できました。");
				
			} else if(balance > 0) {

				int charge500 = balance / 500;
				int charge100 = balance % 500 / 100;
				int charge50 = balance % 100 / 50;
				int charge10 = balance % 50 / 10;
				
				System.out.println("ドリンクが購入できました。お釣りは" + balance + "円です。");
				System.out.println("500円硬貨：" + charge500 + "枚");
				System.out.println("100円硬貨：" + charge100 + "枚");
				System.out.println("50円硬貨：" + charge50 + "枚");
				System.out.println("10円硬貨：" + charge10 + "枚");
			}
		} else if(balance < 160) {
			System.out.println("金額が足りません。");
		}
		scan.close();
	}

}
