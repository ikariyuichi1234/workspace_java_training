package exam;

import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {
		
		System.out.println("年齢を入力してください");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		System.out.println("生まれてから現在までの");
		System.out.println("おおよその日数は " + (int)(age * 365) + "日 です");
		
		scan.close();
	}

}
