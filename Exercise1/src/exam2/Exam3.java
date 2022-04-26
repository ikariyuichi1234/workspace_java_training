package exam2;

import java.util.Scanner;

public class Exam3 {

	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
//		入力された文字列を参照できる形式に置換
		for (int i = 0; i < num; i++) {
			String str = sc.nextLine();
			String[] command = str.split(" ");
			
//		入力された文字列の前半部分を参照して処理の振り分け
			if (command[0].equals("SET")) {
				if (command[1].equals("1")) {
					num1 = Integer.parseInt(command[2]);
				}
				if (command[1].equals("2")) {
					num2 = Integer.parseInt(command[2]);
				}
			} 
			if (command[0].equals("ADD")) {
				num2 = num1 + Integer.parseInt(command[1]);
			}
			if (command[0].equals("SUB")) {
				num2 = num1 - Integer.parseInt(command[1]);
			}
		}
		
		System.out.println(num1 + " " + num2);
		 sc.close();
	
	}

}
