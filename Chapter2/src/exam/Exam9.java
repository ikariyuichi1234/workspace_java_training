package exam;

import java.util.Scanner;

public class Exam9 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("お金を投入してください。");
		int balance = scan.nextInt();
		
		if(balance >= 160) {
			balance -= 160;
			
			if(balance == 0) {
				System.out.println("ドリンクが購入できました。【お釣りなし】");
				
			} else if(balance > 0) {
				System.out.println("ドリンクが購入できました。【お釣りあり】");
			}
		} else if(balance < 160) {
			System.out.println("金額が足りません。");
		}
		scan.close();
	}

}
