package exam;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("中間試験の点数を入力");
		int x = scan.nextInt();
		
		System.out.println("期末試験の点数を入力");
		int y = scan.nextInt();
		
		boolean requirement = x >= 90 || y >= 90;
		
		if(x >= 60 && y >= 60) {
			System.out.println("合格");
			
		} else if(x + y >= 130) {
			System.out.println("合格"); 
			
		} else if(x + y >= 100 && requirement) {
			System.out.println("合格"); 
			
		} else {
			System.out.println("不合格"); 
			
		}
		scan.close();
	}

}
