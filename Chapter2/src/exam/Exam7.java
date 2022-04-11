package exam;

import java.util.Scanner;

public class Exam7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("月を表す数値を入力");
		int month = scan.nextInt();
		
		switch(month) {
		
		case 2:
			System.out.println("28日");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30日");
			break;
			
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31日");
			break;
			
		default:
			System.out.println("入力が間違っています");
		
		}
		
		scan.close();
	}
}
