package exam;

import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("２つの文字列を入力");
		String str01 = scan.nextLine();
		String str02 = scan.nextLine();
		
		if(str01.equals(str02)) {
			System.out.println("同じ文字列が入力された");
			
		} else {
			System.out.println("異なる文字列が入力された");
			
		}
		scan.close();
	}

}
