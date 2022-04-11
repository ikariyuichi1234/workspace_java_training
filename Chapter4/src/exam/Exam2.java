package exam;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] data = new int[10];
		System.out.println("任意の数値を10個入力");
		
		for(int i = 0; i < data.length; i++) {
			data[i] = scan.nextInt();
		}
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[data.length - 1 - i]); 
		}
		scan.close();

	}

}